package com.java.arrays.rec.dp;

import java.util.Arrays;

public class DynamicClimbStairs {
    public static void main(String[] args) {
        int stairCount = 4;
        int arr[] = new int[stairCount + 1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= stairCount; i++) {
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[stairCount]);
    }
}
