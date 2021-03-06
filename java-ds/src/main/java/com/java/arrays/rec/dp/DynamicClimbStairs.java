package com.java.arrays.rec.dp;

import java.util.Arrays;

public class DynamicClimbStairs {
    public static void main(String[] args) {
        int stairCount = 6;
        int arr[] = new int[stairCount + 1];

        arr[0] = 1; // base case

        for (int i = 1; i <= stairCount; i++) {
            arr[i] = getValueAt(arr, i, 3)
                    + getValueAt(arr, i, 2)
                    + getValueAt(arr, i, 1);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[stairCount]);
    }

    private static int getValueAt(int arr[], int i, int step) {
        // base case at 0 = 1 ways, -ve = 0 ways
        if (i - step < 0) {
            return 0;
        }
        return arr[i - step];
    }
}
