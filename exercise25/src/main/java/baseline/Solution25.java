/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.Arrays;
import java.util.Scanner;


public class Solution25 {
    private String password;

    public static void main(String[] args) {
        Solution25 solution = new Solution25();
        //prompt the user for input
        //change the user's String to a character array
        //using the returned value from passwordStrengthChecker print out the correct statement
    }

    public String userInput() {
        //get the users input as a String
    }

    public int passwordStrengthChecker(String password) {
        Boolean num;
        Boolean character;
        Boolean length;
        Boolean specialChar;

        //start with a for loop to go through every character in the array
        //inside the loop check for specific characters and use Booleans to show if they exist or not
        //very weak if only num is true and length < 8 (false)
        //weak if only character is true and length < 8 (false)
        //strong if num AND char are true and length >= 8 (true)
        //very strong if num AND char AND specialChar are true and length >= 8 (true)
                //GET ASCII VALUE FOR SPECIAL CHARACTERS
        //returns an int 1-4 that relates to an output statement
    }

}
