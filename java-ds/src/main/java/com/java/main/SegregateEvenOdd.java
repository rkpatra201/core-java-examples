package com.java.main;

import java.util.Arrays;

public class SegregateEvenOdd {
    public static void main(String[] args) {
        quickEvenOdd();
    }

    public static void quickEvenOdd() {
        int arr[] = {1, 5, 4, 2, 3, 7, 9, 10, 10};
        int pivot = arr[arr.length - 1];
        int i = -1;
        int j = 1 + 1;
        int pivotRem = pivot % 2;
        while (j < arr.length - 1) {
            if (arr[j] % 2 == pivotRem) { // == or !=
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
            j++;
        }
        if (arr[i] % 2 == pivotRem) {
            int t = arr[i + 1];
            arr[i + 1] = arr[arr.length - 1];
            arr[arr.length - 1] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
