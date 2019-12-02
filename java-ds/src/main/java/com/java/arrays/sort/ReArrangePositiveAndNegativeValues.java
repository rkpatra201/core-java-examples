package com.java.arrays.sort;

import java.util.Arrays;

public class ReArrangePositiveAndNegativeValues {
    public static void main(String[] args) {
        int arr[] = {20, -1, -8, -3 - 2, -10, 4, 91, -5, -6, 7, 8, 9};

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
        for (int index = 1; index < arr.length / 2; index = index + 2) {
            int reverseIndex = arr.length - 1 - index;
            int t = arr[index];
            arr[index] = arr[reverseIndex];
            arr[reverseIndex] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
