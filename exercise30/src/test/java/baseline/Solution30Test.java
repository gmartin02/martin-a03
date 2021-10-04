/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {
    @Test
    void multiplicationFunctionTest() {
        Solution30 solution = new Solution30();
        assertEquals(12, solution.multiplicationFunction(4, 3));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12})
    void multiplicationFunctionTest(int a) {
        Solution30 solution = new Solution30();
        assertEquals(a*5, solution.multiplicationFunction(a, 5));
    }

}