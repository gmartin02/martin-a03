package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {
    @Test
    void getEmployeeListTest() {
        Solution39 solution = new Solution39();
        assertEquals("Johnson", solution.getEmployeeList().get(0).get("John"));
    }


}