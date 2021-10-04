/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.Scanner;


public class Solution25 {
    private String password;
    private int strength;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution25 solution = new Solution25();
        //prompt the user for input
        System.out.println("Please enter a password: ");
        solution.password = solution.userInput();

        //change the user's String to a character array
        solution.strength = solution.passwordValidator(solution.password.toCharArray());

        //using the returned value from passwordStrengthChecker print out the correct statement
        if(solution.strength == 1){
            System.out.printf("The password \"%s\" is very weak!", solution.password);
        }
        if(solution.strength == 2){
            System.out.printf("The password \"%s\" is weak!", solution.password);
        }
        if(solution.strength == 3){
            System.out.printf("The password \"%s\" is strong!", solution.password);
        }
        if(solution.strength == 4){
            System.out.printf("The password \"%s\" is very strong!", solution.password);
        }
        if(solution.strength == 0) {
            System.out.println("Strength of the password could not be determined.");
        }
    }

    public String userInput() {
        //get the users input as a String
        return input.nextLine();
    }

    public int passwordValidator(char[] password) {
        boolean num = false;
        boolean character = false;
        boolean length = false;
        boolean specialChar = false;

        //start with a for loop to go through every character in the array
        for(int i = 0; i < password.length; i++) {
            //inside the loop check for specific characters and use Booleans to show if they exist or not
            if (password[i] >= 48 && password[i] < 58) {
                num = true;
            }
            if (password.length >= 8) {
                length = true;
            }
            if ((password[i] >= 65 && password[i] < 91) || (password[i] >= 97 && password[i] < 123)) {
                character = true;
            }
            if ((password[i] >= 33 &&  password[i] < 48) || ( password[i] >= 58 &&  password[i] < 65) || (password[i] >= 91 && password[i] < 97) || (password[i] >= 123 && password[i] < 127)) {
                specialChar = true;
            }
        }
        //very weak if only num is true and length < 8 (false)
        if(num && !length && !specialChar && !character){
            return 1;
        }
        //weak if only character is true and length < 8 (false)
        if(character && !length && !specialChar && !num){
            return 2;
        }
        //strong if num AND char are true and length >= 8 (true)
        if(num && character && length){
            //very strong if num AND char AND specialChar are true and length >= 8 (true)
            if(specialChar){
                return 4;
            }
            return 3;
        }
        //returns an int 0-4 that relates to an output statement
        return 0;
    }
}
