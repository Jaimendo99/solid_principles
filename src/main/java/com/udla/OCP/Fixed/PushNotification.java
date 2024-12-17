package com.udla.OCP.Fixed;

public class PushNotification implements NotificationInterface{
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending Push Notification: "+ content);
    }
}
