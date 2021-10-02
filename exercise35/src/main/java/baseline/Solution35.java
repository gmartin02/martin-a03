/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    private static final Scanner input = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        Solution35 solution = new Solution35();
        //call the getNameArray method
        ArrayList<String> names;
        names = (ArrayList<String>) solution.getNameArray();
        //get random number using the length of the array list as a parameter
        //pass the random number and array list into choose winner method
        System.out.printf("The winner is %s", solution.chooseWinner(names, solution.randomNumberGenerator(names.size())));

    }

    public List<String> getNameArray() {
        ArrayList<String> names = new ArrayList<>();
        //while the user input is not empty
        while(true) {
            //prompt the user to enter a name
            System.out.print("Enter a name: ");
            //add the name to the end of the String  list
            String userInput = input.nextLine();

            if(userInput.equals("")) {
                //return the array of names entered
                return names;
            } else {
                names.add(userInput);
            }
        }

    }

    public int randomNumberGenerator(int length) {
        //return a random number from 0 to the length of the array list
        return random.nextInt(length);
    }

    public String chooseWinner(List<String> name, int rng) {
        //return the element at the index of rng
        return name.get(rng);
    }
}
