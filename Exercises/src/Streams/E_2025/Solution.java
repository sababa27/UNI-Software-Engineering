package Streams.E_2025;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Solution {
    private static Boolean isPalindrome(String word){
        // 0123456
        for(int i=0; i<word.length(); i++)
            if(word.charAt(i) != word.charAt(word.length()-1-i))
                return false;
        return true;
    }

    public static String longestPalindrome(ArrayList<String> list){
        Stream<String> palindromes = list.stream().filter(s -> isPalindrome(s));
        String ans = palindromes.reduce("", (a, b) ->{
           if(a.length() > b.length())
               return a;
           return b;
        });


        return ans;
    }
}
