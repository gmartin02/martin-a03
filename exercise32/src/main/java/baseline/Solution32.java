/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

public class Solution32 {
    private int gameDifficulty;
    private int randomNumber;

    public static void main(String[] args) {
        Solution32 solution = new Solution32();
        //print a welcome message
        //calls getGameDifficulty
        //checks game difficulty using if statements and calls the proper RNG for whatever difficulty
        //calls guessTheNumberGame passing in the random number as a parameter
    }

    public void guessTheNumberGame(int randomNumber) {
        int counter = 1;
        //prompt the user to guess a number for the first time

        //while userGuess doesn't equal the random number
            //check if the number is too low or too high and print the proper message
            //clear the user's guess
            //prompt for another number
            //increment the counter

        //print how many guesses it took to get the number using the counter

    }

    public int getGameDifficulty() {
        //prompt for difficulty
        //return the int of the difficulty
    }

    public int difficultyOneRandomNumGenerator() {
        //returns an int between 1 and 10
    }

    public int difficultyTwoRandomNumGenerator() {
        //returns an int between 1 and 100
    }

    public int difficultyThreeRandomNumGenerator() {
        //returns an int between 1 and 1000
    }


}
