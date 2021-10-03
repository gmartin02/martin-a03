package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {
    @Test
    void getEmployeeListTest1() {
        Solution39 solution = new Solution39();
        assertEquals("John", solution.getEmployeeList().get(0).get("Johnson"));
    }

    @Test
    void getEmployeeListTest2() {
        Solution39 solution = new Solution39();
        assertEquals("Manager", solution.getEmployeeList().get(1).get("Johnson"));
    }

    @Test
    void getEmployeeListTest3() {
        Solution39 solution = new Solution39();
        assertEquals("2016-12-31", solution.getEmployeeList().get(2).get("Johnson"));
    }

    @Test
    void sortByLastNameTest() {
        Solution39 solution = new Solution39();
        Map<String, String> firstNames = new TreeMap<>();
        firstNames.put(Solution39.JOHNSON, "John");
        firstNames.put(Solution39.XIONG, "Tou");
        firstNames.put(Solution39.MICHAELSON, "Michaela");
        firstNames.put(Solution39.JACOBSON, "Jake");
        firstNames.put(Solution39.JACKSON, "Jacquelyn");
        firstNames.put(Solution39.WEBBER, "Sally");

        assertEquals(firstNames, solution.sortByLastName(solution.getEmployeeList()).get(0));
    }


}