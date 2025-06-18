package org.example;

public class EmailService {
    public static void send(String to, String content) {
        System.out.println("Enviando email para: " + to);
        System.out.println("Conteúdo:\n" + content);
    }
}
