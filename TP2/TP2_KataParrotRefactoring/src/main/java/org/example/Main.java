package org.example;

public class Main {
    public static void main(String[] args) {
        Parrot european = new Parrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);
        Parrot african = new Parrot(ParrotTypeEnum.AFRICAN, 2, 0, false);
        Parrot norwegian = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 3.0, false);

        System.out.println("Velocidade Europeu: " + european.getSpeed() + " | Som: " + european.getCry());
        System.out.println("Velocidade Africano: " + african.getSpeed() + " | Som: " + african.getCry());
        System.out.println("Velocidade Norueguês: " + norwegian.getSpeed() + " | Som: " + norwegian.getCry());
    }
}
