package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    PaymentCalculator calc = new PaymentCalculator();

    @Test
    void calculateMonthsUntilPaidOffTest() {
        assertEquals(70, calc.calculateMonthsUntilPaidOff(5000, (float) ((12/100)/365), 100));
    }

}