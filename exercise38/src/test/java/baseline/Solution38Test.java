/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    @Test
    void filterEvenNumbersTest1() {
        Solution38 solution = new Solution38();
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(0, solution.filterEvenNumbers(testArray)[0] % 2);
        assertEquals(0, solution.filterEvenNumbers(testArray)[1] % 2);
        assertEquals(0, solution.filterEvenNumbers(testArray)[2] % 2);
        assertEquals(0, solution.filterEvenNumbers(testArray)[3] % 2);
    }

    @Test
    void filterEvenNumbersTest2() {
        Solution38 solution = new Solution38();
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = {2, 4, 6, 8};
        assertArrayEquals(expected, solution.filterEvenNumbers(testArray));
    }


}