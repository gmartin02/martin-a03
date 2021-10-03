package baseline;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {
    @Test
    void getEmployeeListTest1() {
        Solution40 solution = new Solution40();
        assertEquals("John", solution.getEmployeeList().get(0).get("Johnson"));
    }

    @Test
    void getEmployeeListTest2() {
        Solution40 solution = new Solution40();
        assertEquals("Manager", solution.getEmployeeList().get(1).get("Johnson"));
    }

    @Test
    void getEmployeeListTest3() {
        Solution40 solution = new Solution40();
        assertEquals("2016-12-31", solution.getEmployeeList().get(2).get("Johnson"));
    }

}