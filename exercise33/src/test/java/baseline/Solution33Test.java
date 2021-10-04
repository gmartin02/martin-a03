/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    @Test
    void randomNumberGeneratorTest() {
        Solution33 solution = new Solution33();
        assertTrue(solution.randomNumberGenerator() >= 0 && solution.randomNumberGenerator() < 4);
    }

    @Test
    void answerQuestionTest() {
        Solution33 solution = new Solution33();
        int rng = solution.randomNumberGenerator();
        assertEquals(solution.answers[rng], solution.answerQuestion(rng));
    }
}