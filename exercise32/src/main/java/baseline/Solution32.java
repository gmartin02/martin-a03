/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Solution32 {
    private static final String ERROR_MESSAGE = "That was not a number.";
    private int gameDifficulty;
    private int randomNumber;
    private static final Scanner input = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {
        Solution32 solution = new Solution32();
        //print a welcome message
        System.out.println("Let's play Guess the Number!\n");
        //calls getGameDifficulty
        solution.gameDifficulty = solution.getGameDifficulty();
        //checks game difficulty using if statements and calls the proper RNG for whatever difficulty
        if(solution.gameDifficulty == 1) {
            solution.randomNumber = solution.difficultyOneRandomNumGenerator();
        }

        if(solution.gameDifficulty == 2) {
            solution.randomNumber = solution.difficultyTwoRandomNumGenerator();
        }

        if(solution.gameDifficulty == 3) {
            solution.randomNumber = solution.difficultyThreeRandomNumGenerator();
        }
        //calls guessTheNumberGame passing in the random number as a parameter
        solution.guessTheNumberGame(solution.randomNumber);
    }

    public void guessTheNumberGame(int randomNumber) {
        int counter = 0;
        int userGuess;

        while(true) {
            try {
                //prompt the user to guess a number for the first time
                System.out.println("I have my number. What is your guess?");
                userGuess = input.nextInt();
                counter++;
                break;
            } catch (InputMismatchException e) {
                System.out.println(ERROR_MESSAGE);
                input.nextLine();
                counter++;
            }
        }

        while(true) {
            try {
                //while userGuess doesn't equal the random number
                while (userGuess != randomNumber) {
                    //check if the number is too low or too high and print the proper message
                    if (userGuess > randomNumber) {
                        System.out.println("Last valid input was too high. Guess again: ");
                    } else {
                        System.out.println("Last valid input was too low. Guess again: ");
                    }
                    //update the user's guess
                    userGuess = input.nextInt();
                    //increment the counter
                    counter++;
                }
                    break;
            } catch(InputMismatchException e) {
                System.out.println(ERROR_MESSAGE);
                input.nextLine();
                counter++;
            }
        }
        //print how many guesses it took to get the number using the counter
        System.out.printf("You got it in %d guesses!", counter);
    }

    public int getGameDifficulty() {

        while(true) {
            try {
                //prompt for difficulty
                System.out.println("Enter the difficulty level (1, 2, or 3)");
                //return the int of the difficulty
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(ERROR_MESSAGE);
                input.nextLine();
            }
        }
    }

    public int difficultyOneRandomNumGenerator() {
        //returns an int between 1 and 10
        return random.nextInt(10) + 1;
    }

    public int difficultyTwoRandomNumGenerator() {
        //returns an int between 1 and 100
        return random.nextInt(100) + 1;
    }

    public int difficultyThreeRandomNumGenerator() {
        //returns an int between 1 and 1000
        return random.nextInt(1000) + 1;
    }


}
