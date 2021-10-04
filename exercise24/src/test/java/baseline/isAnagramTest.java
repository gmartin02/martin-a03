/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    Solution24 solution = new Solution24();
    String str1 = "boofgall";
    String str2 = "goofball";
    String str3 = "goodball";
    String str4 = "good ball";

    // shows that a true value can be produced correctly
    @Test
    void isAnagramTest1() {
        assertTrue(solution.isAnagram(str1.toCharArray(), str2.toCharArray()));
    }

    //shows that a false value can be produced correctly
    @Test
    void isAnagramTest2() {
        assertFalse(solution.isAnagram(str1.toCharArray(), str3.toCharArray()));
    }

    //shows that a space does matter and will make isAnagram return false
    @Test
    void isAnagramTest3() {
        assertFalse(solution.isAnagram(str3.toCharArray(), str4.toCharArray()));
    }
}