package com.java.string;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringMain {
    public static void main(String[] args) {
        String result = String.join(",", Arrays.asList("sachin","rahul"));
        System.out.println(result);

        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("sachin").add("rahul");
        System.out.println(sj.toString());
    }
}
