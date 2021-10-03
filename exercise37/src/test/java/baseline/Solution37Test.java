package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {
    @Test
    void generatePasswordTest() {
        Solution37 solution = new Solution37();
        assertTrue(solution.generatePassword(2, 2).length() >= 8);
    }
}