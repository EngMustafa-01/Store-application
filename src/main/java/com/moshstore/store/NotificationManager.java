package com.moshstore.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

    private NotificationService notificationService;

    public NotificationManager (@Qualifier("email") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification (String message) {
        notificationService.send("Hello Notification", "waiting");
    }
}
