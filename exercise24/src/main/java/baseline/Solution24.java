package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    private static final Scanner input = new Scanner(System.in);
    private String word1;
    private String word2;

    public static void main(String[] args) {
        Solution24 solution = new Solution24();
        //prompt user to enter the first word and store it in String word1
        System.out.println("Enter the first string: ");
        solution.word1 = solution.userInputWord();

        //prompt user to enter the second word and store it in String word2
        System.out.println("Enter the second string: ");
        solution.word2 = solution.userInputWord();

        char[] char1 = solution.word1.toCharArray();
        char[] char2 = solution.word2.toCharArray();
        //call isAnagram with word1 and word2 as parameters inside an if statement
        //is true print is an anagram
        //is false print is not an anagram
        if (solution.isAnagram(char1, char2)){
            System.out.printf("%s and %s are anagrams!", solution.word1, solution.word2);
        }


    }
    public boolean isAnagram(char[] word1, char[] word2) {
        // first check if their sizes are the same and if not return false
        if(word1.length != word2.length) {
            return false;
        }

        // use Arrays.sort method to get them in alphabetical order
        Arrays.sort(word1);
        Arrays.sort(word2);

        // then use a for loop using the size of the string to check if each ordered character is the same
        // return true if the loop runs until the end return false if one of the characters doesn't match
        for(int i = 0;i < word1.length; i++) {
            if(word1[i] != word2[i]) {
                return false;
            }
        }
        return true;
    }

    public String userInputWord() {
        //return the next String received
        return input.next();
    }
}
