package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    Solution28 solution = new Solution28();
    @Test
    void addingFiveNumbersTest() {
        solution.addingNumbers(1);
        solution.addingNumbers(2);
        solution.addingNumbers(3);
        solution.addingNumbers(4);

        assertEquals(15, solution.addingNumbers(5));
    }

}