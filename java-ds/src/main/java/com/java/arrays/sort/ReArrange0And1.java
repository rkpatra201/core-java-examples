package com.java.arrays.sort;

import java.util.Arrays;

public class ReArrange0And1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 2, -1, 0, 0};
        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) { // 0 for all 0 are in right side.
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
