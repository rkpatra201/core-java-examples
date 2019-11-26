package com.java.arrays.common;

import java.util.*;

public class PythagoreanTriplets {
    public static void main(String[] args) {

        int arr[] = new int[20];
        for (int i = 1; i < 20; i++) {
            arr[i] = i * i;
        }

        arr = new int[]{25, 64, 9, 16, 36, 100, 32};
        for (int i = 0; i < arr.length - 1; i++) {
            SumOfTwoNumbersIsK.sumOfTwoNumbers(arr, arr[i]);
        }
    }
}
