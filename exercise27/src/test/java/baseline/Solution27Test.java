package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    Solution27 solution = new Solution27();

    @Test
    void validateInputTest1() {
        assertTrue(solution.validateInput("John", "Smith", "AA-1234", 33029));
    }

    @Test
    void validateNameLengthTest1() {
        assertTrue(solution.validateNameLength("John"));
    }

    @Test
    void validateNameFilledTest1() {
        assertTrue(solution.validateNameFilled("Smith"));
    }

    @Test
    void validateEmployeeIDTest1() {
        assertTrue(solution.validateEmployeeID("AA-1234"));
    }

    @Test
    void validateZipCodeTest1() {
        assertTrue(solution.validateZipCode(33029));
    }

    @Test
    void validateNameLengthTest2() {
        assertFalse(solution.validateNameLength("J"));
    }

    @Test
    void validateNameFilledTest2() {
        assertFalse(solution.validateNameFilled(""));
    }

    @Test
    void validateEmployeeIDTest2() {
        assertFalse(solution.validateEmployeeID("A1-1234"));
    }

    @Test
    void validateZipCodeTest2() {
        assertFalse(solution.validateZipCode(9999));
    }


}