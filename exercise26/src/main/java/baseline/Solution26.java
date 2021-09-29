/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */

package baseline;

import java.util.Scanner;

public class Solution26 {
    private float balance;
    private float APR;
    private float monthlyPayment;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution26 solution = new Solution26();

        //prompts the user for balance
        System.out.println("What is your balance? ");
        solution.balance = solution.getBalance();

        //prompts the user for APR as a percent
        System.out.println("What is the APR on your card as a percent? ");
        solution.APR = solution.getAPR();

        //prompts the user for monthly payments
        System.out.println("What is the monthly payment you can make? ");
        solution.monthlyPayment = solution.getMonthlyPayment();

        //creates a PaymentCalculator object to calculate the months remaining
        PaymentCalculator calc = new PaymentCalculator();

        //calls the calculateMonthsUntilPaidOff function with the variables in this class passed in
        //prints out the value returned by the above function call
        System.out.printf("It will take you %d months to pay off this card", calc.calculateMonthsUntilPaidOff(solution.balance, solution.APR, solution.monthlyPayment));
    }
    public float getAPR() {
        //gets the APR from the user
        float apr = input.nextFloat();
        //divides it by 100 to get it as a decimal
        apr = apr/100;
        //also divides it by 365 to get the daily rate
        apr = apr/365;
        //returns daily APR
        return apr;
    }
    public float getMonthlyPayment() {
        //returns value of monthly payment from the user
        return input.nextFloat();
    }

    public float getBalance() {
        //returns value of the balance given by the user
        return input.nextFloat();
    }
}
