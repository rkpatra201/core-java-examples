package com.java.arrays.sort;

import java.util.Arrays;

public class SortUsingReverseAt0Index {

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 7, 3, 4};
        int unsortedArrayLength = arr.length - 1;
        while(unsortedArrayLength  > 0) {
            int indexOfMaxValue = findIndexOfMaxValue(arr, 0, unsortedArrayLength);
            reverse(arr, 0, indexOfMaxValue);
            reverse(arr, 0, unsortedArrayLength);
            unsortedArrayLength--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int findIndexOfMaxValue(int arr[], int i, int j) {
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
            reverse(arr, ++i, --j);
        }
    }
}
