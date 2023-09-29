package com.deudvalgte.miniproject1.service;

import client.IIPSOAP;
import client.IPSOAPLocator;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MessageService {

    public String getMessage(String name, String IPAddress) throws ServiceException, RemoteException {

        // Makes sure we only check the first name
        String firstName = name.split(" ")[0];

        // REST API call
        String probableGender = getProbableGender(firstName);

        // SOAP API call
        String countryCode = getCountryCode(IPAddress);

        String title = getTitle(probableGender);

        // Output
        return "Dear " + title + " " + name + " from " + countryCode;
    }

    private String getProbableGender(String firstName) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.genderize.io?name=" + firstName;
        JsonNode rootNode = restTemplate.getForObject(url, JsonNode.class);

        return rootNode.path("gender").asText();

    }


    private String getCountryCode(String IPAddress) throws ServiceException, RemoteException {
        IPSOAPLocator locator = new IPSOAPLocator();
        IIPSOAP service = locator.getDOTSGeoPinPoint();
        String trialKey = "WS1-CGW1-PLQ3";
        String countryCode = service.getLocationByIP_V4(IPAddress, trialKey).getCountryISO2();

        // The api can't determine the country code for some static IP addresses
        // Returns Unknown if null.
        return Objects.requireNonNullElse(countryCode, "Unknown");
    }

    private String getTitle(String gender) {
        if (gender.equals("male")) {
            return "Mr.";
        } else if (gender.equals("female")) {
            return "Ms.";
        } else {
            return "";
        }
    }
}
