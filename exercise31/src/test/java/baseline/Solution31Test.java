/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    @Test
    void karvonenHeartRateCalcTest1() {
        Solution31 solution = new Solution31();
        assertEquals(138, solution.karvonenHeartRateCalc(22, 65, 0.55));
    }

    @Test
    void karvonenHeartRateCalcTest2() {
        Solution31 solution = new Solution31();
        assertEquals(142, solution.karvonenHeartRateCalc(50, 90, 0.65));
    }

    @Test
    void karvonenHeartRateCalcTest3() {
        Solution31 solution = new Solution31();
        assertEquals(209, solution.karvonenHeartRateCalc(4, 80, 0.95));
    }
}