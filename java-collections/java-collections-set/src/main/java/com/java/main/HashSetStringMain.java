package com.java.main;

import java.util.HashSet;
import java.util.Set;

public class HashSetStringMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add(new String("abc"));
        set.add(new String("abc"));

        System.out.println(set.size());

    }
}
