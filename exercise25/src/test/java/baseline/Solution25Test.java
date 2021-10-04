/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    Solution25 solution = new Solution25();

    String pass1 = "12345";
    String pass2 = "abcdefg";
    String pass3 = "12abcdefg345";
    String pass4 = "12abcdefg345!@";
    String pass5 = "@@123";

    @Test
    void passwordStrengthChecker1() {
        assertEquals(1, solution.passwordValidator(pass1.toCharArray()));
    }

    @Test
    void passwordStrengthChecker2() {
        assertEquals(2, solution.passwordValidator(pass2.toCharArray()));
    }

    @Test
    void passwordStrengthChecker3() {
        assertEquals(3, solution.passwordValidator(pass3.toCharArray()));
    }

    @Test
    void passwordStrengthChecker4() {
        assertEquals(4, solution.passwordValidator(pass4.toCharArray()));
    }

    @Test
    void passwordStrengthChecker5() {
        assertEquals(0, solution.passwordValidator(pass5.toCharArray()));
    }
}