package com.java.main;

public class RecursionReverseString {
    public static void main(String[] args) {
        String input = "test the app";
        String output = reverseString(input);
        System.out.println("output: " + output);

        output = new StringUtil(input).reverseString();
        System.out.println(output);
    }

    static int count = 0;

    public static String reverseString(String str) {
        count++;
        if (str.isEmpty()) {
            return str;
        } else {
            String result = reverseString(str.substring(1)) + str.charAt(0);
            return result;
        }
    }
}

class StringUtil {

    private StringBuffer sb;
    private int reverseIndex;
    private String input;

    public StringUtil(String input) {
        this.input = input;
        this.reverseIndex = input.length() - 1;
        sb = new StringBuffer();
    }

    public String reverseString() {
        if (input == null || input.length() == 0) {
            return input;
        } else {
            if (reverseIndex >= 0) {
                sb.append(input.charAt(reverseIndex));
                reverseIndex--;
                reverseString();
            }
        }
        return sb.toString();
    }
}
