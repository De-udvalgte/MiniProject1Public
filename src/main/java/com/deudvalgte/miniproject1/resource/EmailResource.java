package com.deudvalgte.miniproject1.resource;

import com.deudvalgte.miniproject1.domain.HttpResponse;
import com.deudvalgte.miniproject1.model.EmailUser;
import com.deudvalgte.miniproject1.service.EmailService;
import com.deudvalgte.miniproject1.service.RequestService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
public class EmailResource {

    private final EmailService emailService;
    private final RequestService requestService;

    @PostMapping
    public ResponseEntity<HttpResponse> sendEmail(@RequestBody EmailUser emailUser, HttpServletRequest request) {
        String clientIp = requestService.getClientIp(request);
        emailService.sendHtmlEmail(emailUser.getName(), emailUser.getEmail(), clientIp);
        return ResponseEntity.ok(
                HttpResponse.builder()
                        .timeStamp(LocalDateTime.now().toString())
                        .statusCode(200)
                        .message("Email sent")
                        .requestMethod("POST")
                        .build()
        );
    }

    @PostMapping("/all")
    public ResponseEntity<HttpResponse> sendEmailToAll() {
        emailService.sendEmailToAll();
        return ResponseEntity.ok(
                HttpResponse.builder()
                        .timeStamp(LocalDateTime.now().toString())
                        .statusCode(200)
                        .message("Email sent to all")
                        .requestMethod("POST")
                        .build()
        );
    }


}
