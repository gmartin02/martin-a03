/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution36 {
    ArrayList<Integer> responseTimes = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution36 solution = new Solution36();
        //get the responseTime array
        solution.responseTimes = (ArrayList<Integer>) solution.getResponseTime();

        //print out the average calling the function
        System.out.printf("%nThe average is %.2f%n", solution.average(solution.responseTimes));
        //print out the std calling the function
        System.out.printf("The std is %.2f%n", solution.std(solution.responseTimes, solution.average(solution.responseTimes)));
        //print out the min calling the function
        System.out.printf("The min is %d%n", solution.min(solution.responseTimes));
        //print out the max calling the function
        System.out.printf("The max is %d%n", solution.max(solution.responseTimes));
    }

    public List<Integer> getResponseTime() {
        ArrayList<Integer> times = new ArrayList<>();

        //while true
        while(true) {
            //prompt the user for a number
            System.out.print("Enter a number: ");
            //get input from user
            String userInput = input.nextLine();
            //if user input is done
            if(userInput.equals("done")) {
                //return the integer list
                return times;
            } else {
                try {
                    //try to parse into an int
                    times.add(Integer.parseInt(userInput));
                } catch (NumberFormatException e) {
                    //catch the exception and have them enter another number
                    System.out.println("That was not a number.");
                }
            }
        }
    }

    public double average(List<Integer> responseTimes) {
        //return average of all the values in the list using streams
        return responseTimes.stream().mapToDouble(d -> d).average().orElse(0.0);
    }

    public double std(List<Integer> responseTimes, double avg) {
        //get the mean from the above function
        double std = 0;
        //loop through every number in the array
        for(int i = 0; i < responseTimes.size(); i++) {
            //keep adding (num-mean)^2 to the std variable
            std += Math.pow((responseTimes.get(i) - avg), 2);
        }
        //return the sqrt(std/length of the array)
        return Math.round((Math.sqrt(std/responseTimes.size())) * 100.0) / 100.0;
    }

    public int min(List<Integer> responseTimes) {
        //turn it into an array
        Object[] array = responseTimes.toArray();
        //initialize the first value to responseTimes[0]
        int lowest = (int) array[0];
        //loop through each element and only store the lowest number
        for(int i = 0;i < array.length; i++) {
            if(lowest > (int)array[i]) {
                lowest = (int)array[i];
            }
        }
        //return lowest number
        return lowest;
    }

    public int max(List<Integer> responseTimes) {
        //turn it into an array
        Object[] array = responseTimes.toArray();
        //initialize the first value to responseTimes[0]
        int largest = (int) array[0];
        //loop through each element and only store the largest number
        for(int i = 0;i < array.length; i++) {
            if(largest < (int)array[i]) {
                largest = (int)array[i];
            }
        }
        //return largest number
        return largest;
    }
}
