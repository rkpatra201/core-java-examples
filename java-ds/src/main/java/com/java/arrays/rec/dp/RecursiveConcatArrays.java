package com.java.arrays.rec.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveConcatArrays {
    public static void main(String[] args) {
        String[] s1 = {"1", "2", "3", "4"};
        String[] s2 = {"A", "B", "C"};
        List<String> list = new ArrayList<>();
        merge(s1, s2, 0, 0, list);
        System.out.println(list);

        String[] s3 = {"D", "E", "F"};
        String[][] objects = {s1, s2, s3};
        list.clear();
        String[] tempCartesianProductArray = null;
        for (int i = objects.length - 1; i >= 0; i--) {
            String[] arr = objects[i];
            tempCartesianProductArray = list.toArray(new String[list.size()]);
            list.clear();
            merge(arr, tempCartesianProductArray, 0, 0, list);
        }
        System.out.println(list);
    }

    private static void merge(String[] s1, String[] s2, int l1, int l2, List<String> list) {
        if (s2.length == 0) {
            list.addAll(Arrays.asList(s1));
            return;
        }
        if (l1 == s1.length) {
            // System.out.println(list);
            return;
        } else {
            if (l2 == s2.length) { // visited all elements of l2
                l2 = 0; // reset l2
                l1++; // increment l1
            } else {
                list.add(s1[l1] + s2[l2]); // concat
                l2++; // increment l2
            }
            merge(s1, s2, l1, l2, list); // recursive call
        }
    }
}


