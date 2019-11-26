package com.java.arrays.sort;

import java.util.Arrays;

public class ReArrangePositiveAndNegativeValues {
    public static void main(String[] args) {
        int arr[] = {20, -1, 0, -2, 4, 91, -5, -6, 7, 8, 9};

        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] <= 0) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
