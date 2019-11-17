package com.java.arrays.common;

import java.util.Arrays;
import java.util.Collections;

public class SegregateEvenAndOddMain {
    public static void main(String[] args) {
        segregateEvenAndOdd();
        segregateEvenAndOddWithSortEvenAndOdd();
    }

    private static void segregateEvenAndOddWithSortEvenAndOdd() {
        Integer arr[] = {10, 5, 8, 12, 7, 20, 9, 17, 40, 41, 28};

        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        Arrays.sort(arr, 0, i + 1, Collections.reverseOrder());
        Arrays.sort(arr, i + 1, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void segregateEvenAndOdd() {
        Integer arr[] = {10, 5, 8, 12, 7, 20, 9};

        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
