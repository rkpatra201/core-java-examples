package com.java.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abcdabcdefghe";
        char[] arr = s.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for(Character c : arr)
        {
            if(charSet.contains(c))
            {
                charSet.remove(c);
            }
            else
            {
                charSet.add(c);
            }
        }
        // f is the first non repeating char
        System.out.println(charSet);
    }
}
