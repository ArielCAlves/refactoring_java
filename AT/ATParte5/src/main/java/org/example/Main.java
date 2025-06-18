package org.example;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.notifyUser("EMAIL", "Welcome!");
        service.notifyUser("SMS", "Code 1234");
        service.notifyUser("PUSH", "Push OK!");
    }
}
