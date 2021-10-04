package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void searchForStringTest() {
        Solution40 solution = new Solution40();

        List<ArrayList<String>> testSearchResults = new ArrayList<>();
        ArrayList<String> testFirstNames = new ArrayList<>();
        testFirstNames.add("Jacquelyn");
        testFirstNames.add("Jake");

        ArrayList<String> testLastNames = new ArrayList<>();
        testLastNames.add("Jackson");
        testLastNames.add("Jacobson");

        ArrayList<String> testPosition = new ArrayList<>();
        testPosition.add("DBA");
        testPosition.add("Programmer");

        ArrayList<String> testDates = new ArrayList<>();
        testDates.add("");
        testDates.add("");

        testSearchResults.add(testFirstNames);
        testSearchResults.add(testLastNames);
        testSearchResults.add(testPosition);
        testSearchResults.add(testDates);

        assertEquals(testSearchResults, solution.searchForString(solution.getEmployeeList(), "Jac"));
        assertNotEquals(testSearchResults, solution.searchForString(solution.getEmployeeList(), "Jack"));
        assertNotEquals(testSearchResults, solution.searchForString(solution.getEmployeeList(), "JaC"));
    }

}