/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.ArrayList;
import java.util.List;

public class Solution36 {
    public static void main(String[] args) {

    }

    public List<Integer> getResponseTime() {
        ArrayList<Integer> responseTimes;
        //while true
            //prompt the user for a number
            //get input from user
            //if user input is done
                //return the integer list
            //else
                //try to parse into an int
                //catch the exception and have them enter another number
    }

    public double average(List<Integer> responseTimes) {
        //return average of all the values in the list using streams
    }

    public double std(List<Integer> responseTimes) {
        //get the mean from the above function
        //loop through every number in the array
            //keep adding (num-mean)^2 to the std variable
        //return the sqrt(std/length of the array)
    }

    public int min(List<Integer> responseTimes) {
        //turn it into an array
        //loop through each element and only store the lowest number
        //initialize the first value to responseTimes[0]
        //return lowest number
    }

    public int max(List<Integer> responseTimes) {
        //turn it into an array
        //loop through each element and only store the largest number
        //initialize the first value to responseTimes[0]
        //return largest number
    }
}
