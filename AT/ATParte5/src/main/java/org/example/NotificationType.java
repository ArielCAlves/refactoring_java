package org.example;

public enum NotificationType {
    EMAIL(new EmailNotification()),
    SMS(new SmsNotification()),
    PUSH(new PushNotification());

    private final NotificationChannel channel;

    NotificationType(NotificationChannel channel) {
        this.channel = channel;
    }

    public NotificationChannel getChannel() {
        return channel;
    }

    public static NotificationType fromString(String value) {
        return switch (value.toUpperCase()) {
            case "EMAIL" -> EMAIL;
            case "SMS" -> SMS;
            case "PUSH" -> PUSH;
            default -> throw new IllegalArgumentException("Unsupported channel: " + value);
        };
    }
}
