package com.java.arrays.common;

public class MissingNumberBinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int left = 0;
        int right = arr.length;

        int missingValue = binarySearch(left, right, arr);
        System.out.println(missingValue);

    }

    private static int binarySearch(int left, int right, int[] a) {
        int middle = left + (right - left) / 2;
        if (left >= right) {
            if (middle >= a.length) {
                return -1;
            }
            return a[middle] - 1;
        }
        if (a[0] + middle < a[middle])
            return binarySearch(left, middle, a);
        else
            return binarySearch(middle + 1, right, a);
    }
}
