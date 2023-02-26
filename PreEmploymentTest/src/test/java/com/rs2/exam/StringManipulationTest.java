package com.rs2.exam;


import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {

    @Test
    public void testReverseWords() {
        String input = "hello world";
        String expectedOutput = "olleh dlrow";
        String actualOutput = StringManipulation.reverseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseWordsWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = StringManipulation.reverseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseWordsWithSingleWord() {
        String input = "java";
        String expectedOutput = "avaj";
        String actualOutput = StringManipulation.reverseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseWordsWithLeadingAndTrailingSpaces() {
        String input = "hello world";
        String expectedOutput = "olleh dlrow";
        String actualOutput = StringManipulation.reverseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseWord() {
        String input = "hello";
        String expectedOutput = "olleh";
        String actualOutput = StringManipulation.reverseWord(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseWordWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = StringManipulation.reverseWord(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseWordWithSingleCharacter() {
        String input = "a";
        String expectedOutput = "a";
        String actualOutput = StringManipulation.reverseWord(input);
        assertEquals(expectedOutput, actualOutput);
    }


}