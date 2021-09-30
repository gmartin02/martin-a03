/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */

package baseline;

import java.util.Scanner;

public class Solution28 {
    private static final Scanner input = new Scanner(System.in);
    private int total = 0;
    public static void main(String[] args) {
        Solution28 solution = new Solution28();
        //loops two functions five times
        for(int i = 0; i < 5;i++) {
            solution.addingNumbers(solution.userInput());
        }
        //print out the total
        System.out.println("The sum is " + solution.total);
    }

    public int userInput() {
        //prompts for a number 5 times using a for loop
        System.out.println("Please enter a number");
        return input.nextInt();
    }
    public int addingNumbers(int num) {
        //before then end of an iteration the entered number is added to sum
        total += num;
        return total;
    }
}
