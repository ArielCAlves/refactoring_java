package org.example;

public class EmailNotification implements NotificationChannel {
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
