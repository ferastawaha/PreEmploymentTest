package com.rs2.exam;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CollectionsTest {
    @Test
    public void testParseInput() {
        String input = "4,8,3,10,55,12,44,44,0";
        List<Integer> expected = Arrays.asList(4, 8, 3, 10, 55, 12, 44, 44, 0);
        List<Integer> actual = Collections.parseInput(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSortAndRemoveDuplicates() {
        List<Integer> inputList = Arrays.asList(4, 8, 3, 10, 55, 12, 44, 44, 0);
        List<Integer> expected = Arrays.asList(0, 3, 4, 8, 10, 12, 44, 55);
        List<Integer> actual = Collections.sortAndRemoveDuplicates(inputList);
        assertEquals(expected, actual);
    }
}