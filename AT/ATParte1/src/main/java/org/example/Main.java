package org.example;

public class Main {
    public static void main(String[] args) {
        Classifier classifier = new Classifier();
        classifier.classify(11);
        classifier.classify(10);
        classifier.classify(5);
        classifier.classify(-9999);
    }
}
