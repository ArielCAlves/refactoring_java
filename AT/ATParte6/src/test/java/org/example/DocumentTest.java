package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    private String captureOutput(Document document) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        document.print();
        return out.toString().trim();
    }

    @Test
    public void testPdfDocument() {
        assertEquals("Printing PDF", captureOutput(new PdfDocument()));
    }

    @Test
    public void testHtmlDocument() {
        assertEquals("Printing HTML", captureOutput(new HtmlDocument()));
    }

    @Test
    public void testUnknownDocument() {
        assertEquals("Unknown format", captureOutput(new UnknownDocument()));
    }
}
