package org.example;

public class NotificationService {
    public void notifyUser(String channel, String message) {
        NotificationType type = NotificationType.fromString(channel);
        type.getChannel().send(message);
    }
}
