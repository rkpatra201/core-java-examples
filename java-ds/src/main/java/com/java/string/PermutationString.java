package com.java.string;

public class PermutationString {
    public static void main(String[] args) {
        permute(" ", "ABC");
    }

    public static void permute(String first, String second) {
        // logic is here
        System.out.println(first+"::"+second);
        if (second.length() == 0) {
            System.out.println(first);
            return;
        }
        for (int i = 0; i < second.length(); i++) {
            String n_first = first + second.charAt(i);
            String n_second = second.substring(0, i) + second.substring(i + 1);
            permute(n_first, n_second);
        }
    }
}
