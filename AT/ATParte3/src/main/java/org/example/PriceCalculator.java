package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceCalculator {

    private static final BigDecimal HOLIDAY_BONUS = new BigDecimal("0.05");

    public BigDecimal calculate(BigDecimal basePrice, int customerTypeCode, boolean isHoliday) {
        CustomerType type = CustomerType.fromCode(customerTypeCode);
        BigDecimal discount = type.getDiscount();
        if (isHoliday) {
            discount = discount.add(HOLIDAY_BONUS);
        }
        BigDecimal multiplier = BigDecimal.ONE.subtract(discount);
        return basePrice.multiply(multiplier).setScale(2, RoundingMode.HALF_UP);
    }
}
