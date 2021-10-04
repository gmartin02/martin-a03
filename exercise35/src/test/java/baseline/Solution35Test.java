/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void randomNumberGeneratorTest() {
        Solution35 solution = new Solution35();
        int rng = solution.randomNumberGenerator(5);
        assertTrue(rng >=0 && rng < 5);
    }

    @Test
    void chooseWinnerTest() {
        Solution35 solution = new Solution35();
        ArrayList<String> namesTest = new ArrayList<>();
        namesTest.add("Jim");
        namesTest.add("Dwight");
        namesTest.add("Pam");
        namesTest.add("Michael");

        int rng = solution.randomNumberGenerator(4);

        assertEquals(namesTest.get(rng), solution.chooseWinner(namesTest, rng));
    }
}