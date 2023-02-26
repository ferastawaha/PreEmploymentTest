package com.rs2.exam;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        System.out.print("Enter the word to search for: ");
        String searchWord = scanner.nextLine();
        while (searchWord == null || searchWord.trim().isEmpty()) {
            System.out.print("Enter a valid word to search for: ");
            searchWord = scanner.nextLine();
        }
        int count = countOccurrences(fileName, searchWord);
        System.out.println("The word \"" + searchWord + "\" occurs " + count + " times in the file \"" + fileName + "\".");
    }

    /**
     * Counts the number of occurrences of a specified word in a file.
     *
     * @param fileName   the name of the file to search
     * @param searchWord the word to search for
     * @return the number of occurrences of the specified word in the file
     */
    public static int countOccurrences(String fileName, String searchWord) {
        int count = 0;
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.equals(searchWord)) {
                    count++;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
            return -1;
        }
        return count;
    }
}
