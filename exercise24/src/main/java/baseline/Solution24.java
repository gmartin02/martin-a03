package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    private char[] word1;
    private char[] word2;

    public static void main(String[] args) {
        Solution24 solution = new Solution24();
        //prompt user to enter the first word and store it in String word1

        //prompt user to enter the second word and store it in String word2

        //call isAnagram with word1 and word2 as parameters inside an if statement
        //is true print is an anagram
        //is false print is not an anagram


    }
    public boolean isAnagram(char[] word1, char[] word2) {
        // first check if their sizes are the same and if not return false
        // use Arrays.sort method to get them in alphabetical order
        // then use a for loop using the size of the string to check if each ordered character is the same
        // return true if the loop runs until the end return false if one of the characters doesn't match
    }

    public String userInputWord() {
        //return the next String received
    }
}
