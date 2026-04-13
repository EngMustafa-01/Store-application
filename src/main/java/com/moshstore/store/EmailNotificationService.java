package com.moshstore.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {

    @Value("${mailServer.host}")
    private String host;

    @Value("${mailServer.port}")
    private int port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Recipient Message: " + recipientEmail);
        System.out.println("Email message: " + message);
        System.out.println("via host: " + host + " port: "+ port);
        System.out.println("The email was Received ✅");
    }
}
