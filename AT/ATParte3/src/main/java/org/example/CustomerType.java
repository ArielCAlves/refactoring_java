package org.example;

import java.math.BigDecimal;

public enum CustomerType {
    REGULAR(new BigDecimal("0.10")),
    PREMIUM(new BigDecimal("0.15")),
    UNKNOWN(BigDecimal.ZERO);

    private final BigDecimal discount;

    CustomerType(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public static CustomerType fromCode(int code) {
        return switch (code) {
            case 1 -> REGULAR;
            case 2 -> PREMIUM;
            default -> UNKNOWN;
        };
    }
}
