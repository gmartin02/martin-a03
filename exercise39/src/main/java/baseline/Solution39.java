/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.*;

public class Solution39 {
    public static final String JOHNSON = "Johnson";
    public static final String XIONG = "Xiong";
    public static final String MICHAELSON = "Michaelson";
    public static final String JACOBSON = "Jacobson";
    public static final String JACKSON = "Jackson";
    public static final String WEBBER = "Webber";

    private final List<Map<String, String>> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        Solution39 solution = new Solution39();
        //prints out the sorted list that was obtained from the unsorted list
        solution.printNewListOfMaps(solution.sortByLastName(solution.getEmployeeList()));
    }

    public List<Map<String, String>> getEmployeeList() {
        //creates the employee list from the table provided in the exercise
        Map<String, String> firstNames = new HashMap<>();
        firstNames.put(JOHNSON, "John");
        firstNames.put(XIONG, "Tou");
        firstNames.put(MICHAELSON, "Michaela");
        firstNames.put(JACOBSON, "Jake");
        firstNames.put(JACKSON, "Jacquelyn");
        firstNames.put(WEBBER, "Sally");

        employeeList.add(firstNames);

        Map<String, String> positions = new HashMap<>();
        positions.put(JOHNSON, "Manager");
        positions.put(XIONG, "Software Engineer");
        positions.put(MICHAELSON, "District Manager");
        positions.put(JACOBSON, "Programmer");
        positions.put(JACKSON, "DBA");
        positions.put(WEBBER, "Web Developer");

        employeeList.add(positions);

        Map<String, String> separationDate = new HashMap<>();
        separationDate.put(JOHNSON, "2016-12-31");
        separationDate.put(XIONG, "2016-10-05");
        separationDate.put(MICHAELSON, "2015-12-19");
        separationDate.put(JACOBSON, "");
        separationDate.put(JACKSON, "");
        separationDate.put(WEBBER, "2015-12-18");

        employeeList.add(separationDate);

        return employeeList;
    }

    public List<Map<String, String>> sortByLastName(List<Map<String, String>> employeeList) {
        //creates an empty new list of maps
        List<Map<String, String>> employeeByLastName = new ArrayList<>();

        //only requires the first map lastNames to sort correctly
        Map<String, String> treeMapFirstNames = new TreeMap<>(employeeList.get(0));
        employeeByLastName.add(treeMapFirstNames);
        //now the map is sorted by last names

        //after sorting the first map the changes are implemented to each other map the same way
        Map<String, String> treeMapPositions = new TreeMap<>(employeeList.get(1));
        employeeByLastName.add(treeMapPositions);

        Map<String, String> treeMapSeparationDate = new TreeMap<>(employeeList.get(2));
        employeeByLastName.add(treeMapSeparationDate);

        //returns sorted list
        return employeeByLastName;
    }

    public void printNewListOfMaps(List<Map<String, String>> employeeByLastName) {
        System.out.println("Name\t\t\t\t   | Position\t\t\t| Separation Date");
        System.out.println("-----------------------|--------------------|----------------");
        //uses a combination of for loops and formatting identifiers

        //to make it easier turn each map in the list into an array list
        Set<String> lastNames = employeeByLastName.get(0).keySet();
        ArrayList<String> listOfLastNames = new ArrayList<>(lastNames);

        Collection<String> firstNames = employeeByLastName.get(0).values();
        ArrayList<String> listOfFirstNames = new ArrayList<>(firstNames);

        Collection<String> position = employeeByLastName.get(1).values();
        ArrayList<String> listOfPositions = new ArrayList<>(position);

        Collection<String> separationDate = employeeByLastName.get(2).values();
        ArrayList<String> listOfDates = new ArrayList<>(separationDate);

        for(int i = 0;i < employeeByLastName.get(0).size();i++) {
            System.out.format("%-10s %-12s| %-18s | %-10s%n", listOfFirstNames.get(i), listOfLastNames.get(i), listOfPositions.get(i), listOfDates.get(i));
        }
        //prints out the new map after being sorted
    }
}
