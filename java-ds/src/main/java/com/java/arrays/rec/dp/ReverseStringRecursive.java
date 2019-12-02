package com.java.arrays.rec.dp;

public class ReverseStringRecursive {
    public static void main(String[] args) {
        String input = "abcd";
        char[] ch = input.toCharArray();
        reverseString(ch, 0, input.length() - 1);
        System.out.println(ch);
        System.out.println(reverseString(input));
    }

    private static String reverseString(String input) {
        if (input.isEmpty()) {
            return input;
        } else {
            return reverseString(input.substring(1)) + input.charAt(0);
        }
    }

    private static void reverseString(char[] ch, int i, int j) {
        if (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            reverseString(ch, ++i, --j);
        }
    }
}
