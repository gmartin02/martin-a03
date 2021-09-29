package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    PaymentCalculator calc = new PaymentCalculator();
    Solution26 solution = new Solution26();

    @Test
    void calculateMonthsUntilPaidOffTest() {
        assertEquals(70, calc.calculateMonthsUntilPaidOff(solution.getBalance(), solution.getAPR(), solution.getMonthlyPayment()));
    }

}