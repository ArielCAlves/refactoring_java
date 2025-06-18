package org.example;

public class PushNotification implements NotificationChannel {
    public void send(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}
