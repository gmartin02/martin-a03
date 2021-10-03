/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.Scanner;

public class Solution38 {
    private static final Scanner input = new Scanner(System.in);
    private int[] userArray;
    private int[] newArray;

    public static void main(String[] args) {
        Solution38 solution = new Solution38();
        //gets input from the user
        solution.userArray = solution.getUserArray();
        //removes all odd numbers from the string
        solution.newArray = solution.filterEvenNumbers(solution.userArray);
        //prints out the new string
        solution.printArray(solution.newArray);
    }
    public void printArray(int[] array) {
        System.out.print("The even numbers are: ");
        for(int i = 0;i < array.length;i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    public int[] filterEvenNumbers(int[] numberArray) {
        int evenCounter = 0;
        for(int i = 0;i < numberArray.length; i++) {
            if(numberArray[i] % 2 == 0) {
                evenCounter++;
            }
        }

        int[] evenNumberArray = new int[evenCounter];

        int j = 0;
        for(int i = 0;i < numberArray.length; i++) {
            if(numberArray[i] % 2 == 0) {
                evenNumberArray[j] = numberArray[i];
                j++;
            }
        }
        //returns an array with only even numbers
        return evenNumberArray;
    }

    public int[] getUserArray() {
        //prompts the user to enter a list of numbers separated by a single white space
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String userInput = input.nextLine();
        //splits the user's String into an array
        String[] stringArray = userInput.split(" ");
        int[] numberArray = new int[stringArray.length];

        for(int i = 0;i < stringArray.length; i++){
            numberArray[i] = Integer.parseInt(stringArray[i]);
        }
        //returns the String
        return numberArray;
    }
}
