package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    Solution27 solution = new Solution27();

    @Test
    void validateInputTest() {
        assertTrue(solution.validateInput("J", "", "AA-1234", 33029));
    }

    @Test
    void validateNameLengthTest() {
        assertTrue(solution.validateNameLength("John"));
    }

    @Test
    void validateNameFilledTest() {
        assertTrue(solution.validateNameFilled(""));
    }

    @Test
    void validateEmployeeIDTest() {
        assertTrue(solution.validateEmployeeID("AA-1234"));
    }

    @Test
    void validateZipCodeTest() {
        assertTrue(solution.validateZipCode(33029));
    }


}