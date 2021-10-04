/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    @Test
    void removeFromArrayTest() {
        Solution34 solution = new Solution34();
        String[] inputArray = {"Gabriel Martin", "Christopher DeVita", "Angel Ramirez", "Jackie Pijuan", "Isabella Pinilla"};
        String[] testArray = {"Gabriel Martin", "Christopher DeVita", "Angel Ramirez", "Isabella Pinilla"};

        assertArrayEquals(testArray, solution.removeFromArray("Jackie Pijuan", inputArray));
    }

    @Test
    void removeFromArrayTwiceTest() {
        Solution34 solution = new Solution34();
        String[] inputArray = {"Gabriel Martin", "Christopher DeVita", "Angel Ramirez", "Jackie Pijuan", "Isabella Pinilla"};
        String[] testArray = {"Gabriel Martin", "Christopher DeVita", "Angel Ramirez"};

        String[] result = solution.removeFromArray("Jackie Pijuan", inputArray);
        assertArrayEquals(testArray, solution.removeFromArray("Isabella Pinilla", result));
    }
}