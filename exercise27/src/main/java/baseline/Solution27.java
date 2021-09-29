/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

public class Solution27 {
    private boolean errorFlag;
    private String firstName;
    private String lastName;
    private String employeeID;
    private int zipCode;

    public static void main(String[] args) {
        //calls user input
        //calls validateInput

    }
    public void userInput() {
        //gets the users input for all 4 required fields
    }

    public boolean validateInput(String firstName, String lastName, String employeeID, int zipCode) {
        //checks the length of first and last name
        //checks if first and last name are filled
        //checks if ID is following the correct format
        //checks if zip code is a five-digit number
        //returns true only IF all conditions were met
        //if any condition is false it prints out the correct error message
    }

    public boolean validateNameLength(String name) {
        //returns true if the name is at least two characters long
    }


    public boolean validateNameFilled(String name) {
        //returns true if name is not null
    }

    public boolean validateEmployeeID(String employeeID) {
        //turns ID into a character array
        //checks for 2 letters, a hyphen, and 4 numbers using the indexes of the array
        //returns true if the above rule is followed
    }

    public boolean validateZipCode(int zipCode) {
        //checks if 9999<zipCode<100000 and returns true if it is
    }
}
