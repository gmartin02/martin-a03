package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    @Test
    void karvonenHeartRateCalcTest() {
        Solution31 solution = new Solution31();
        assertEquals(138, solution.karvonenHeartRateCalc(22, 65));
    }
}