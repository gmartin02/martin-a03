/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution31 {
    private int userAge;
    private int restingHR;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution31 solution = new Solution31();
        //get age and restingHR from the user
        solution.userAge = solution.getUserAge();
        solution.restingHR = solution.getRestingHeartRate();
        //prints age and resting heart rate
        System.out.printf("Resting Pulse: %d\t\tAge: %d%n", solution.restingHR, solution.userAge);
        //calls the print table function
        solution.printTable();
    }

    public int getUserAge() {
        int age;
        while(true) {
            //prompts the user for their age
            System.out.println("PLease enter your age.");
            try {
                age = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please only enter numbers");
                input.nextLine();
            }
        }
        //returns the user's age
        return age;
    }

    public int getRestingHeartRate() {
        int hr;
        while(true) {
            //prompts the user for their resting heart rate
            System.out.println("PLease enter your resting heart rate.");
            try {
                hr = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please only enter numbers");
                input.nextLine();
            }
        }
        //returns the user's resting heart rate
        return hr;
    }

    public int karvonenHeartRateCalc(int age, int restingHR, double intensity) {
        //returns the heart rate using the formula
        return (int) Math.round((((220-age)-restingHR)*intensity)+restingHR);
    }

    public void printTable() {

        char column = '|';
        System.out.printf("Intensity\t%cRate%n", column);
        System.out.printf("------------|--------%n");
        //loops starting at 55 and increments by 5
        for(int i = 55;i <= 95;i+=5) {
            //prints out the intensity followed by a dashed line
            System.out.printf("%d%%\t\t\t%c", i, column);
            //prints out the karvonen heart rate
            System.out.printf("%d bpm", karvonenHeartRateCalc(userAge, restingHR, i/100.0));
            //prints out %n
            System.out.printf("%n");
        }
    }
}
