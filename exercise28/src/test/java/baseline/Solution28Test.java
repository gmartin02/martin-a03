/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    Solution28 solution = new Solution28();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void addingFiveNumbersTest(int num) {
        solution.total = 3;
        assertEquals(num+3, solution.addingNumbers(num));
    }

}