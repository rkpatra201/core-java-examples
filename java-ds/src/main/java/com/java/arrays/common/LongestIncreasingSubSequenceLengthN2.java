package com.java.arrays.common;

import java.util.Arrays;

public class LongestIncreasingSubSequenceLengthN2 {
    public static void main(String[] args) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};

        int lis[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            lis[i] = 1;
        }

        for (int i = 1; i < arr.length; i++)
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < (lis[j] + 1)) {
                    lis[i] = lis[j] + 1;
                }
            }
        System.out.println(Arrays.toString(lis));
        int max = 0;
        for (int i : lis) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
