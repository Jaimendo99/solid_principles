package com.udla.OCP.Fixed;

public class NotificationService {

    public void sendNotification(NotificationInterface notification, String content) {
        notification.sendNotification(content);
    }
}
