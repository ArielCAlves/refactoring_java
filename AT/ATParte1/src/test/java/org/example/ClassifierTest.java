package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ClassifierTest {

    private String captureOutput(int input) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Classifier().classify(input);
        return out.toString();
    }

    @Test
    public void testAlto() {
        assertTrue(captureOutput(11).contains("ALTO"));
    }

    @Test
    public void testMedio() {
        assertTrue(captureOutput(10).contains("MEDIO"));
    }

    @Test
    public void testBaixo() {
        assertTrue(captureOutput(5).contains("BAIXO"));
    }

    @Test
    public void testCasoRaro() {
        assertTrue(captureOutput(-9999).contains("CASO RARO"));
    }
}
