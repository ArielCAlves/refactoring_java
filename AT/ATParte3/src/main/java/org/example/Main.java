package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator();
        System.out.println(calculator.calculate(new BigDecimal("1000.00"), 1, false));
        System.out.println(calculator.calculate(new BigDecimal("1000.00"), 2, true));
        System.out.println(calculator.calculate(new BigDecimal("1000.00"), 0, true));
    }
}
