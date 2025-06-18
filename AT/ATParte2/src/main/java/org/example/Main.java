package org.example;

public class Main {
    public static void main(String[] args) {
        Invoice nota1 = new Invoice(new Client("Urameshi", "urameshi@email.com"), 500.0, 1);
        Invoice nota2 = new Invoice(new Client("Kurosaki", "kurosaki@email.com"), 1200.0, 2);
        Invoice nota3 = new Invoice(new Client("Uzumaki", "uzumaki_invalido"), 300.0, 99);
        nota1.process();
        nota2.process();
        nota3.process();
    }
}
