package com.rs2.exam;

import java.util.*;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers separated by commas: ");
        String input = scanner.nextLine();
        List<Integer> inputList = parseInput(input);
        List<Integer> sortedList = sortAndRemoveDuplicates(inputList);
        System.out.println("Sorted list with duplicates removed: " + sortedList);
    }

    /**
     * Parses a comma-separated string of integers into a list of integers.
     *
     * @param input the input string to parse
     * @return a list of integers parsed from the input string
     */
    public static List<Integer> parseInput(String input) {
        // Split the input string into individual elements separated by commas,
        // remove leading/trailing whitespace, and filter out any elements that
        // do not match the regular expression for a positive integer.
        // Then convert each remaining element to an integer and collect them
        // into a new list.
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .filter(s -> s.matches("^\\d+$"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
    /**

     Sorts a list of integers and removes any duplicates.
     @param inputList the list of integers to sort and remove duplicates from
     @return a new list of sorted integers with duplicates removed
     */
    public static List<Integer> sortAndRemoveDuplicates(List<Integer> inputList) {
        // Use a stream to first remove duplicates with the distinct() method, then sort with the sorted() method
        // Finally, add each element to the sortedList with the forEach() method and a method reference to the add() method
        List<Integer> sortedList = new ArrayList<>();
        inputList.stream().distinct().sorted().forEach(sortedList::add);
        return sortedList;
    }
}
