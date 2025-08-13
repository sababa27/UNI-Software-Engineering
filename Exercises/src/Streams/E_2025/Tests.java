package Streams.E_2025;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static Streams.E_2025.Solution.longestPalindrome;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testPalindrome(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123456", "12321", "121", "5", "1234321"));
        assertEquals("1234321", longestPalindrome(list));
    }
}
