package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InvoiceTest {

    private String captureOutput(Invoice invoice) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        invoice.process();
        return out.toString();
    }

    @Test
    public void testNotaSimples() {
        Client client = new Client("Urameshi", "urameshi@email.com");
        Invoice invoice = new Invoice(client, 500.0, 1);
        String output = captureOutput(invoice);
        assertTrue(output.contains("Nota fiscal simples"));
        assertTrue(output.contains("Tipo: Simples"));
    }

    @Test
    public void testNotaComImposto() {
        Client client = new Client("Kurosaki", "kurosaki@email.com");
        Invoice invoice = new Invoice(client, 1200.0, 2);
        String output = captureOutput(invoice);
        assertTrue(output.contains("Nota fiscal com imposto"));
        assertTrue(output.contains("Tipo: Com imposto"));
    }

    @Test
    public void testNotaComEmailInvalido() {
        Client client = new Client("Uzumaki", "uzumaki_invalido");
        Invoice invoice = new Invoice(client, 300.0, 99);
        String output = captureOutput(invoice);
        assertTrue(output.contains("Email inválido. Falha no envio."));
    }

    @Test
    public void testTipoDesconhecido() {
        Client client = new Client("Ichigo", "ichigo@email.com");
        Invoice invoice = new Invoice(client, 900.0, 99);
        String output = captureOutput(invoice);
        assertTrue(output.contains("Tipo: Desconhecido"));
        assertTrue(output.contains("Tipo desconhecido"));
    }
}
