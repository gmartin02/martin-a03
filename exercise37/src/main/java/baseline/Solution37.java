/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.security.SecureRandom;
import java.util.List;

public class Solution37 {
    public static final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
    public static final List<Character> letters = List.of('a', 'b', 'c', 'd' , 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    public static final List<Character> specialCharacters = List.of('~', '`', '!', '@', '#', '$', '%', '^', '&', '*',
            '(', ')', '_', '-', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/');

    private int minLength;
    private int numberCount;
    private int specialCharCount;

    public static void main(String[] args) {
        //get all the user input from the user and store it in variables
    }

    public int getMinimumPasswordLength() {
        //return min password length from the user
    }

    public int getNumberOfNumbersInPassword() {
        //return # of numbers from the user
    }

    public int getNumberOfSpecialCharactersInPassword() {
        //return # of special characters from the user
    }

    public String generatePassword(int numbersNeeded, int specialCharactersNeeded) {
        StringBuilder sb = new StringBuilder();
        SecureRandom random = new SecureRandom();

        //use string builder to make building the string easier
        //the min length of the string is equal to (numbersNeeded + specialCharactersNeeded) * 2 if the user specified a smaller string
            //random number will be added to it for variation
        //loop through (length - (numbersNeeded + specialCharactersNeeded) to add letters first
        //loop through numbersNeeded to add numbers
        //loop through specialCharactersNeeded to add special characters

        //randomize the order of the characters in the string

        //return the built string
    }

}
