package org.example;

public class Classifier {

    public void classify(int value) {
        ClassificationLevel level = determineLevel(value);
        printLevel(level);
        printDebug(value);
    }

    private ClassificationLevel determineLevel(int value) {
        if (value == -9999) return ClassificationLevel.CASO_RARO;
        if (value > 10) return ClassificationLevel.ALTO;
        if (value == 10) return ClassificationLevel.MEDIO;
        return ClassificationLevel.BAIXO;
    }

    private void printLevel(ClassificationLevel level) {
        System.out.println(level.name().replace("_", " "));
    }

    private void printDebug(int value) {
        System.out.println("DEBUG: z = " + value);
    }
}
