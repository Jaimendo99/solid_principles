package com.udla.OCP.Fixed;

public class FaxNotification implements NotificationInterface {
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending Fax: "+ content);
    }
}
