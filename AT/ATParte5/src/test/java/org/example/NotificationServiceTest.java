package org.example;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    private String captureOutput(String channel, String message) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new NotificationService().notifyUser(channel, message);
        return out.toString();
    }

    @Test
    public void testEmailNotification() {
        String result = captureOutput("EMAIL", "Hello Email");
        assertTrue(result.contains("Sending EMAIL: Hello Email"));
    }

    @Test
    public void testSmsNotification() {
        String result = captureOutput("SMS", "Hello SMS");
        assertTrue(result.contains("Sending SMS: Hello SMS"));
    }

    @Test
    public void testPushNotification() {
        String result = captureOutput("PUSH", "Hello Push");
        assertTrue(result.contains("Sending PUSH: Hello Push"));
    }

    @Test
    public void testInvalidChannel() {
        assertThrows(IllegalArgumentException.class, () ->
                new NotificationService().notifyUser("FAX", "Fail"));
    }
}
