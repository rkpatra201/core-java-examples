package com.java.main;

import java.util.Arrays;

public class SegregateEvenOdd {
    public static void main(String[] args) {
        quickEvenOdd();
    }

    public static void quickEvenOdd() {
        int arr[] = {1, 5, 4, 2, 3, 7, 9, 10, 10};
        int i = -1;
        int j = 0;
        int pivotRem = 0; // 0 or 1 for even or odd starter
        while (j < arr.length) {
            if (arr[j] % 2 == pivotRem) { // == or !=
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
