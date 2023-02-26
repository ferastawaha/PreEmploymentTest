package com.rs2.exam;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileManipulationTest {
    @Test
    public void testCountOccurrencesWhenFileNotFound() {
        String fileName = "nonexistentfile.txt";
        String searchWord = "hello";
        int expectedCount = -1;

        int actualCount = FileManipulation.countOccurrences(fileName, searchWord);

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountOccurrencesWhenFileEmpty(@TempDir Path tempDir) throws IOException {
        String fileName = "emptyfile.txt";
        String searchWord = "hello";
        int expectedCount = 0;
        Path filePath = tempDir.resolve(fileName);
        Files.createFile(filePath);

        int actualCount = FileManipulation.countOccurrences(filePath.toString(), searchWord);

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountOccurrencesWhenWordNotFound(@TempDir Path tempDir) throws IOException {
        String fileName = "file.txt";
        String searchWord = "hello";
        int expectedCount = 0;
        String fileContents = "this is a test file";
        Path filePath = tempDir.resolve(fileName);
        Files.write(filePath, fileContents.getBytes());

        int actualCount = FileManipulation.countOccurrences(filePath.toString(), searchWord);

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountOccurrencesWhenWordFound(@TempDir Path tempDir) throws IOException {
        String fileName = "file.txt";
        String searchWord = "test";
        int expectedCount = 1;
        String fileContents = "this is a test file";
        Path filePath = tempDir.resolve(fileName);
        Files.write(filePath, fileContents.getBytes());

        int actualCount = FileManipulation.countOccurrences(filePath.toString(), searchWord);

        assertEquals(expectedCount, actualCount);
    }
}