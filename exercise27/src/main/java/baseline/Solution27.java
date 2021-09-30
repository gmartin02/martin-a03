/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String employeeID;
    private int zipCode;

    public static void main(String[] args) {
        Solution27 solution = new Solution27();

        //calls user input
        solution.userInput();

        //calls validateInput
        solution.validateInput(solution.firstName, solution.lastName, solution.employeeID, solution.zipCode);

    }
    public void userInput() {
        //gets the users input for all 4 required fields
        System.out.println("Enter the first name: ");
        firstName = input.next();

        System.out.println("Enter the last name: ");
        lastName = input.next();

        System.out.println("Enter the ZIP code: ");
        zipCode = input.nextInt();

        System.out.println("Enter the employee ID: ");
        employeeID = input.next();
    }

    public boolean validateInput(String firstName, String lastName, String employeeID, int zipCode) {
        //checks the length of first and last name
        boolean fLength = validateNameLength(firstName);
        boolean lLength = validateNameLength(lastName);

        //checks if first and last name are filled
        boolean fFilled = validateNameFilled(firstName);
        boolean lFilled = validateNameFilled(lastName);

        //checks if ID is following the correct format
        boolean idCorrect = validateEmployeeID(employeeID);

        //checks if zip code is a five-digit number
        boolean zipCorrect = validateZipCode(zipCode);

        //returns true only IF all conditions were met
        if(fLength && lLength && fFilled && lFilled && idCorrect && zipCorrect) {
            return true;
        } else {
            return false;
        }
        //if any condition is false it prints out the correct error message
    }

    public boolean validateNameLength(String name) {
        //returns true if the name is at least two characters long
        if(name.length() >= 2){
            return true;
        }
        return false;
    }

    public boolean validateNameFilled(String name) {
        //returns true if name is not null
        if(name != null) {
            return true;
        }
        return false;
    }

    public boolean validateEmployeeID(String employeeID) {
        if(employeeID.length() != 7) {
            return false;
        }

        //checks for 2 letters, a hyphen, and 4 numbers using the indexes of the array
        if(!Character.isLetter(employeeID.charAt(0)) && !Character.isLetter(employeeID.charAt(1))) {
            return false;
        }
        if(employeeID.charAt(2) != '-') {
            return false;
        }
        if(!Character.isDigit(employeeID.charAt(3)) && !Character.isDigit(employeeID.charAt(4)) && !Character.isDigit(employeeID.charAt(5)) && !Character.isDigit(employeeID.charAt(6))) {
            return false;
        }
        //returns true if the above rule is followed
        return true;
    }

    public boolean validateZipCode(int zipCode) {
        //checks if 9999<zipCode<100000 and returns true if it is
        if(zipCode > 9999 && zipCode < 100000) {
            return true;
        }
        return false;
    }
}
