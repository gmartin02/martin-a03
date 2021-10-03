package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {
    @Test
    void generatePasswordTest1() {
        Solution37 solution = new Solution37();
        assertTrue(solution.generatePassword(2, 2, 8).length() >= 8);
    }

    @Test
    void generatePasswordTest2() {
        Solution37 solution = new Solution37();
        assertFalse(solution.generatePassword(2, 3, 8).length() <= 10);
    }
}