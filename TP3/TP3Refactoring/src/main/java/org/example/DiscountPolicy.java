package org.example;

class DiscountPolicy {
    public static double calculateDiscount(double amount, double rate) {
        if (amount < 0 || rate < 0) return 0;
        return amount * rate;
    }
}

