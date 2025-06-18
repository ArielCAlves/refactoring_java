package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = List.of(
                new PdfDocument(),
                new HtmlDocument(),
                new UnknownDocument()
        );

        for (Document doc : documents) {
            doc.print();
        }
    }
}
