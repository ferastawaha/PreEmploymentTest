package com.rs2.exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        String inputString = getUserInput();
        String outputString = reverseWords(inputString);
        System.out.println(outputString);
    }

    /**
     * Prompts the user to enter input from the command line and returns the input as a String.
     * @return a String containing the user's input from the command line
     */
    public static String getUserInput() {
        System.out.print("Enter words: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (input == null || input.trim().isEmpty()) {
            System.out.print("Enter valid words: ");
            input = scanner.nextLine();
        }
        return input;
    }

    /**
     * Reverses the order of words in a given string.
     * @param inputString the string to be processed
     * @return the reversed string
     */
    public static String reverseWords(String inputString) {
        // Split the input string into words using whitespace as the delimiter
        String[] words = inputString.split("\\s+");
        // Reverse the array of words
        Collections.reverse(Arrays.asList(words));
        // Reverse each word in the reversed array using Stream API
        String[] reversedWords = Arrays.stream(words)
                .map(StringManipulation::reverseWord)
                .toArray(String[]::new);
        return String.join(" ", reversedWords);
    }

    /**
     * Reverses the characters in the given word.
     * @param word the word to be reversed.
     * @return the reversed version of the word.
     */
    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
