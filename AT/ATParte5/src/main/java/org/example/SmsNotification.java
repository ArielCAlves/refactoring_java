package org.example;

public class SmsNotification implements NotificationChannel {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
