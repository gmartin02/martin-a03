/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */

package baseline;

import java.util.Scanner;

public class Solution28 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution28 solution = new Solution28();

        //print out the total
        System.out.println("The sum is " + solution.addingFiveNumbers());
    }

    public int addingFiveNumbers() {
        int sum = 0;
        //prompts for a number 5 times using a for loop
        for(int i = 0;i < 5;i++) {
            System.out.println("Please enter a number");

            //before then end of an iteration the entered number is added to sum
            sum += input.nextInt();
        }

        //sum is returned after the loop terminates
        return sum;
    }
}
