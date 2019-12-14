package com.java.arrays.sort;

import java.util.Arrays;

public class SortUsingReverseAt0Index {

    public static void main(String[] args) {

        int arr[] = {1, 5, 6, 7, 3, 4};

        int tempCount = arr.length - 1;
        while(tempCount  > 0) {
            int maxIndex = findIndexOfMax(arr, 0, tempCount);
            reverse(arr, 0, maxIndex);
            reverse(arr, 0, tempCount);
            tempCount--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int findIndexOfMax(int arr[], int i, int j) {
        int max = arr[i];
        int maxIndex = i;
        for (i = 1; i <= j; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void reverse(int[] arr, int i, int j) {
        if (i < j) { // reverse only first and last
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            //reverse(arr, ++i, --j);
        }
    }
}
