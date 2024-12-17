package com.udla.OCP.Fixed;

public class SMSNotification implements NotificationInterface{
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending SMS: "+ content);
    }
}
