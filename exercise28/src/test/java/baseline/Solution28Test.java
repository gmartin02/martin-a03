package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    Solution28 solution = new Solution28();
    @Test
    void addingFiveNumbersTest() {
        assertEquals(15, solution.addingFiveNumbers());
    }

}