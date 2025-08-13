package Streams.Problems;

import org.junit.Test;

import java.util.*;

import static Streams.Problems.Solutions.*;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testProblem0(){
        List<String> list = new ArrayList<>(Arrays.asList("1234", "12", "123"));
        int ans = solution_0((ArrayList<String>) list);
        assertEquals(9, ans);
    }

    @Test
    public void TestProblem1(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int ans = solution_1((ArrayList<Integer>) list);
        assertEquals(9, ans);
    }

    @Test
    public void testProblem10() {
        // Case 1: Typical case
        ArrayList<String> input1 = new ArrayList<>(List.of("apple", "dog", "banana", "cat", "cherry"));
        ArrayList<String> expected1 = new ArrayList<>(List.of("apple", "banana", "cherry"));
        assertEquals(expected1, solution_10(input1));

        // Case 2: All short strings
        ArrayList<String> input2 = new ArrayList<>(List.of("dog", "cat", "bat"));
        ArrayList<String> expected2 = new ArrayList<>();
        assertEquals(expected2, solution_10(input2));

        // Case 3: All long strings
        ArrayList<String> input3 = new ArrayList<>(List.of("banana", "grapes", "orange"));
        ArrayList<String> expected3 = new ArrayList<>(List.of("banana", "grapes", "orange"));
        Collections.sort(expected3);
        assertEquals(expected3, solution_10(input3));

        // Case 5: With duplicates
        ArrayList<String> input5 = new ArrayList<>(List.of("apple", "apple", "banana", "dog", "banana"));
        ArrayList<String> expected5 = new ArrayList<>(List.of("apple", "apple", "banana", "banana"));
        Collections.sort(expected5);
        assertEquals(expected5, solution_10(input5));
    }

    @Test
    public void testProblem11(){
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 2, 3));
        solution_11(input);
    }


}
