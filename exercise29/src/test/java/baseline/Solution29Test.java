package baseline;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 3, 4})
    void ruleOf72CalculatorTest(double rateOfReturn) {
        Solution29 solution = new Solution29();
        assertEquals(72/rateOfReturn, solution.ruleOf72Calculator(rateOfReturn));
    }
}