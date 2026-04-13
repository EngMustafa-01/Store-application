package com.moshstore.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
//@Primary
public class SMSNotificationService implements NotificationService{
    public void send (String message, String recipientEmail) {
        System.out.println("Sending SMS message: " + message);
    }
}
