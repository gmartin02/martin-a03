/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.security.SecureRandom;
import java.util.List;
import java.util.Scanner;

public class Solution37 {
    private static final Scanner input = new Scanner(System.in);
    public static final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
    public static final List<Character> letters = List.of('a', 'b', 'c', 'd' , 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    public static final List<Character> specialCharacters = List.of('~', '`', '!', '@', '#', '$', '%', '^', '&', '*',
            '(', ')', '_', '-', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/');

    private int minLength;
    private int numberCount;
    private int specialCharCount;

    private String password;

    public static void main(String[] args) {
        //get all the user input from the user and store it in variables
        Solution37 solution = new Solution37();
        solution.minLength = solution.getMinimumPasswordLength();
        solution.numberCount = solution.getNumberOfNumbersInPassword();
        solution.specialCharCount = solution.getNumberOfSpecialCharactersInPassword();

        //generate random password
        solution.password = solution.generatePassword(solution.numberCount, solution.specialCharCount, solution.minLength);
        System.out.println("The password is " + solution.password);
    }

    public int getMinimumPasswordLength() {
        //return min password length from the user
        System.out.print("What is the minimum password length?");
        return input.nextInt();
    }

    public int getNumberOfNumbersInPassword() {
        //return # of numbers from the user
        System.out.print("How many numbers?");
        return input.nextInt();
    }

    public int getNumberOfSpecialCharactersInPassword() {
        //return # of special characters from the user
        System.out.print("How many special characters?");
        return input.nextInt();
    }

    public String generatePassword(int numbersNeeded, int specialCharactersNeeded, int minLength) {
        StringBuilder sb = new StringBuilder();
        SecureRandom random = new SecureRandom();
        int length;

        //use string builder to make building the string easier
        //the min length of the string is equal to (numbersNeeded + specialCharactersNeeded) * 2 if the user specified a smaller string
        if(minLength/2 < (numbersNeeded + specialCharactersNeeded)) {
            length = (numbersNeeded + specialCharactersNeeded) * 2 + random.nextInt(4);
            //random number will be added to it for variation
        } else {
            length = minLength + random.nextInt(4);
        }

        //loop through (length - (numbersNeeded + specialCharactersNeeded) to add letters first
        for(int i = 0;i < length - (numbersNeeded + specialCharactersNeeded); i++) {
            sb.append(letters.get(random.nextInt(26)));
        }
        //loop through numbersNeeded to add numbers
        for(int i = 0;i < numbersNeeded; i++) {
            sb.append(numbers.get(random.nextInt(10)));
        }
        //loop through specialCharactersNeeded to add special characters
        for(int i = 0;i < specialCharactersNeeded; i++) {
            sb.append(specialCharacters.get(random.nextInt(10)));
        }
        //randomize the order of the characters in the string

        //return the built string
        return sb.toString();
    }

}
