/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

public class Solution30 {
    public static void main(String[] args) {
        Solution30 solution = new Solution30();
        //calls the print table function
        solution.printMultiplicationTable();

    }

    public void printMultiplicationTable() {
        //uses two nested for loops each iterating from 1 to 12 inclusive
        //calls the multiplicationFunction with the loop variables as inputs
        for(int i = 1;i <= 12;i++) {
            for(int j = 1;j <= 12;j++) {
                //prints out the result each time
                //use %4 to create the columns
                System.out.printf("%5d", multiplicationFunction(i, j));
            }
            //uses %n once the inner loop completes once
            System.out.printf("%n");
        }
    }

    public int multiplicationFunction(int a, int b) {
        //returns a * b to be printed
        return a*b;
    }
}
