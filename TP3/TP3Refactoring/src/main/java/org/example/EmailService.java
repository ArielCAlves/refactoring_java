package org.example;

class EmailService {
    public static void sendEmail(String to, String message) {
        if (to == null || to.isEmpty()) throw new IllegalArgumentException("Destinatário inválido");
        if (message == null || message.isEmpty()) throw new IllegalArgumentException("Mensagem inválida");
        System.out.println("Enviando e-mail para " + to + ": " + message);
    }
}

