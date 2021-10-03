/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.*;

public class Solution40 {
    private static final Scanner input = new Scanner(System.in);
    String searchItem;

    public static final String JOHNSON = "Johnson";
    public static final String XIONG = "Xiong";
    public static final String MICHAELSON = "Michaelson";
    public static final String JACOBSON = "Jacobson";
    public static final String JACKSON = "Jackson";
    public static final String WEBBER = "Webber";

    private final List<Map<String, String>> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        Solution40 solution = new Solution40();
        solution.getEmployeeList();
        //asks the user for a search string
        solution.searchItem = solution.getSearchString();
        //passes search String to search for it
        //prints out the table to show only search results
        solution.printSearchResults(solution.searchForString(solution.searchItem));
    }

    public List<Map<String, String>> getEmployeeList() {
        //creates the employee list from the table provided in the exercise (same as exercise39)
        //creates empty maps for each field
        Map<String, String> firstNames = new HashMap<>();
        //uses put method to fill the maps
        firstNames.put(JOHNSON, "John");
        firstNames.put(XIONG, "Tou");
        firstNames.put(MICHAELSON, "Michaela");
        firstNames.put(JACOBSON, "Jake");
        firstNames.put(JACKSON, "Jacquelyn");
        firstNames.put(WEBBER, "Sally");

        employeeList.add(firstNames);

        //creates empty maps for each field
        Map<String, String> positions = new HashMap<>();
        //uses put method to fill the maps
        positions.put(JOHNSON, "Manager");
        positions.put(XIONG, "Software Engineer");
        positions.put(MICHAELSON, "District Manager");
        positions.put(JACOBSON, "Programmer");
        positions.put(JACKSON, "DBA");
        positions.put(WEBBER, "Web Developer");

        employeeList.add(positions);

        //creates empty maps for each field
        Map<String, String> separationDate = new HashMap<>();
        //uses put method to fill the maps
        separationDate.put(JOHNSON, "2016-12-31");
        separationDate.put(XIONG, "2016-10-05");
        separationDate.put(MICHAELSON, "2015-12-19");
        separationDate.put(JACOBSON, "");
        separationDate.put(JACKSON, "");
        separationDate.put(WEBBER, "2015-12-18");

        employeeList.add(separationDate);

        //returns the filled employeeList
        return employeeList;
    }

    public String getSearchString() {
        //return string to search for from the user
        System.out.print("Enter a search string: ");
        return input.nextLine();
    }

    public List<ArrayList<String>> searchForString(String search) {
        //create a list that can hold the list of maps as a list of array lists
        List<ArrayList<String>> searchList = new ArrayList<>();
        //create an empty list
        List<ArrayList<String>> searchResultList = new ArrayList<>();
        ArrayList<String> firstNameResult = new ArrayList<>();
        ArrayList<String> lastNameResult = new ArrayList<>();
        ArrayList<String> positionResult = new ArrayList<>();
        ArrayList<String> dateResult = new ArrayList<>();

        searchResultList.add(firstNameResult);
        searchResultList.add(lastNameResult);
        searchResultList.add(positionResult);
        searchResultList.add(dateResult);


        //turn each of the individual maps to array lists
        Set<String> lastNames = employeeList.get(0).keySet();
        ArrayList<String> listOfLastNames = new ArrayList<>(lastNames);

        Collection<String> firstNames = employeeList.get(0).values();
        ArrayList<String> listOfFirstNames = new ArrayList<>(firstNames);

        Collection<String> position = employeeList.get(1).values();
        ArrayList<String> listOfPositions = new ArrayList<>(position);

        Collection<String> separationDate = employeeList.get(2).values();
        ArrayList<String> listOfDates = new ArrayList<>(separationDate);

        //add each of the new array lists
        searchList.add(listOfFirstNames);
        searchList.add(listOfLastNames);
        searchList.add(listOfPositions);
        searchList.add(listOfDates);

        //use a for loop to go through each value
        for(int i = 0;i < searchList.get(0).size(); i++) {
            //if search string is in any of the strings of that index
            if(searchList.get(0).get(i).contains(search)||searchList.get(1).get(i).contains(search)) {
                //add that index to the empty list
                searchResultList.get(0).add(searchList.get(0).get(i));
                searchResultList.get(1).add(searchList.get(1).get(i));
                searchResultList.get(2).add(searchList.get(2).get(i));
                searchResultList.get(3).add(searchList.get(3).get(i));
            }
        }
        return searchResultList;
    }

    public void printSearchResults(List<ArrayList<String>> searchResults) {
        System.out.println("Name\t\t\t\t   | Position\t\t\t| Separation Date");
        System.out.println("-----------------------|--------------------|----------------");
        //uses a combination of for loops and formatting identifiers

        //use a for loop to make the table
        for(int i = 0;i < searchResults.get(0).size();i++) {
            System.out.format("%-10s %-12s| %-18s | %-10s%n", searchResults.get(0).get(i), searchResults.get(1).get(i), searchResults.get(2).get(i), searchResults.get(3).get(i));
        }
    }
}
