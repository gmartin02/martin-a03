/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution29 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution29 solution = new Solution29();

        solution.ruleOf72Calculator(solution.rateOfReturnInput());
    }

    public double rateOfReturnInput() {
        //while !done ask for the rate of return
        while(true) {
            System.out.println("Please enter the rate of return: ");

            try {
                if(input.nextDouble() <= 0) {
                    //throws exception if there is either 0 entered or a number is not entered
                    throw new IllegalArgumentException();
                }
                //exits loop if no exception is caught
                break;
            } catch (IllegalArgumentException | InputMismatchException e){
                //when the exception is caught it tells the user
                System.out.println("Sorry, that is not a valid input.");
                input.nextLine();
            }

        }
        //returns a valid user input
        return input.nextDouble();
    }
    public double ruleOf72Calculator(double rateOfReturn) {
        //returns 72 divided by the passed rateOfReturn
        return 72/rateOfReturn;
    }
}
