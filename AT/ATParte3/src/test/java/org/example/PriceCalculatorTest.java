package org.example;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class PriceCalculatorTest {

    @Test
    public void testRegularCustomerNoHoliday() {
        PriceCalculator calc = new PriceCalculator();
        BigDecimal result = calc.calculate(new BigDecimal("1000.00"), 1, false);
        assertEquals(new BigDecimal("900.00"), result);
    }

    @Test
    public void testPremiumCustomerWithHoliday() {
        PriceCalculator calc = new PriceCalculator();
        BigDecimal result = calc.calculate(new BigDecimal("1000.00"), 2, true);
        assertEquals(new BigDecimal("800.00"), result);
    }

    @Test
    public void testUnknownCustomerWithHoliday() {
        PriceCalculator calc = new PriceCalculator();
        BigDecimal result = calc.calculate(new BigDecimal("1000.00"), 0, true);
        assertEquals(new BigDecimal("950.00"), result);
    }
}
