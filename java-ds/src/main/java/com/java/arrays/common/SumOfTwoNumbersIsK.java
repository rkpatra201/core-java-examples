package com.java.arrays.common;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoNumbersIsK {
    public static void main(String[] args) {
        int arr[] = {10, 2, 8, 6, 8, 4, 12};
        sumOfTwoNumbers(arr,16);
        System.out.println("------------");
        sumOfTwoNumbers(arr,12);
    }

    public static void sumOfTwoNumbers(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = k - arr[i];
            if(arr[i]==k) continue;
            if (set.contains(temp)) {
                System.out.println("numbers are: " + temp + " " + arr[i] + " " + k);
            }
            set.add(arr[i]);
        }
    }
}
