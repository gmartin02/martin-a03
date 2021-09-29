package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {
    PaymentCalculator calc = new PaymentCalculator(5000, 100, (float) (0.12/365));

    @Test
    void calculateMonthsUntilPaidOffTest() {
        assertEquals(70, calc.calculateMonthsUntilPaidOff());
    }

}