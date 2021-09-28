package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    Solution25 solution = new Solution25();
    @Test
    void passwordStrengthChecker1() {
        assertEquals(1, solution.passwordStrengthChecker("12345"));
    }

    @Test
    void passwordStrengthChecker2() {
        assertEquals(2, solution.passwordStrengthChecker("abcdefg"));
    }

    @Test
    void passwordStrengthChecker3() {
        assertEquals(3, solution.passwordStrengthChecker("12abcdefg345"));
    }

    @Test
    void passwordStrengthChecker4() {
        assertEquals(4, solution.passwordStrengthChecker("12abcdefg345!@"));
    }

    @Test
    void passwordStrengthChecker5() {
        assertEquals(0, solution.passwordStrengthChecker("@@123"));
    }
}