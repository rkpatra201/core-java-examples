package com.java.string;

import java.util.ArrayList;
import java.util.List;

public class PermutationString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        permute(" ", "baca",list);
        System.out.println(list);
    }

    public static void permute(String first, String second, List<String> list) {
        if (second.length() == 0) {
           // System.out.println(first);
            list.add(first);
            return;
        }
        for (int i = 0; i < second.length(); i++) {
            String n_first = first + second.charAt(i);
            String n_second = second.substring(0, i) +
                    second.substring(i + 1);
            permute(n_first, n_second, list);
        }
    }
}
