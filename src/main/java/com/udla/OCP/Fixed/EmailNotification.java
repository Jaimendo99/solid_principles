package com.udla.OCP.Fixed;

public class EmailNotification implements NotificationInterface {
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending Email: " + content);
    }
}
