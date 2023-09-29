package com.deudvalgte.miniproject1.service;

import com.deudvalgte.miniproject1.model.EmailUser;
import com.deudvalgte.miniproject1.util.TextFileReader;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailService {


    private final JavaMailSender emailSender;
    private final TemplateEngine templeEngine;

    private final MessageService messageService;


    @Async
    public void sendHtmlEmail(String name, String to, String ip) {
        try {
            String greeting = messageService.getMessage(name, ip);

            // Prepare the context for the Thymeleaf HTML template
            Context context = new Context();
            context.setVariable("message", greeting);

            String text = templeEngine.process("emailtemplate", context);

            // Use MimeMessageHelper to assign subject, recipient, sender and the text of the email
            MimeMessage message = getMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setPriority(0);
            helper.setSubject("Invitation to Online meeting");
            helper.setFrom("rexdanorum123@gmail.com");
            helper.setTo(to);
            helper.setText(text, true);

            // Add attachment
            FileSystemResource annual_report = new FileSystemResource("src/main/resources/files/annual_report.pdf");
            helper.addAttachment("annual_report.pdf", annual_report);

            log.info("Sending email to: " + to);

            emailSender.send(message);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    @Async
    public void sendEmailToAll() {
        // Uses data.txt file in the resources' folder.
        for (EmailUser emailUser : getEmailUsers()) {
            sendHtmlEmail(emailUser.getName(), emailUser.getEmail(), emailUser.getIp());
        }
    }

    private ArrayList<EmailUser> getEmailUsers() {
        ArrayList<EmailUser> emailUsers;
        try (BufferedReader br = TextFileReader.readFile("files/data.txt")) {
            emailUsers = new ArrayList<>();

            for (String line : (Iterable<String>) br.lines()::iterator) {
                String[] array = line.split(",");
                EmailUser emailUser = new EmailUser(array[0], array[1], array[2]);
                emailUsers.add(emailUser);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return emailUsers;
    }

    private MimeMessage getMimeMessage() {
        return emailSender.createMimeMessage();
    }

}
