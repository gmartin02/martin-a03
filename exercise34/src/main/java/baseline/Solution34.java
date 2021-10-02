/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.Scanner;

public class Solution34 {
    private final String[] names = {"Gabriel Martin", "Christopher DeVita", "Angel Ramirez", "Jackie Pijuan", "Isabella Pinilla"};
    private String removed;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution34 solution = new Solution34();
        //print initial array
        solution.printArray(solution.names);
        //prompt for which name to remove from the array
        solution.removed = solution.getNameToRemove();
        //removeFromArray(name to be removed, names array)
        //call printArray again with new array as the parameter
        solution.printArray(solution.removeFromArray(solution.removed, solution.names));

    }

    private String getNameToRemove() {
        System.out.println("\nWhich name would you like to remove?");
        return input.nextLine();
    }

    public void printArray(String[] names) {
        //print there are names.length people
        System.out.printf("There are %d people:%n", names.length);
        //for loop going from 0 to name.length
        for(int i = 0;i < names.length; i++) {
            //print out each item in the array
            System.out.println(names[i]);
        }
    }
    public String[] removeFromArray(String removed, String[] names) {
        //make a copy of the array that is one index smaller
        String[] copy = new String[names.length - 1];
        int j = 0;
        //use a for loop going from 0 to array.length
        for(int i = 0;i < names.length; i++) {
            //if i does not equal the index we want to remove
            if (!names[i].equals(removed)) {
                //copy that index into the copy array
                copy[j++] = names[i];
            }
        }
        //return the copy array
        return copy;
    }
}
