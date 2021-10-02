/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    private static final Scanner input = new Scanner(System.in);
    public final String[] answers = {"Yes", "No", "Maybe", "Ask again later."};
    private static final Random random = new Random();

    public static void main(String[] args) {
        Solution33 solution = new Solution33();
        //prompt the user for a question
        solution.askUserAQuestion();
        //get a random number from the RNG method
        //print out the answer using the number generated as the index
        System.out.printf("%s", solution.answerQuestion(solution.randomNumberGenerator()));
    }

    public void askUserAQuestion() {
        //ask the user for a question
        System.out.print("What's your question?\n>");
        input.next();
    }

    public int randomNumberGenerator() {
        //returns a random number between 1 and 4
        return random.nextInt(4);
    }

    public String answerQuestion(int rng) {
        //returns answers[rng] as the String
        return answers[rng];
    }
}
