package com.java.arrays.binary;

public class LengthOfIncreasingSubArray {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 25, 19, 18, 7, 6};
        int index = findDecrementIndex(arr, 0, arr.length - 1);
        System.out.println(index +  1);
    }

    private static int findDecrementIndex(int[] arr, int start, int end) {


        if (arr == null || arr.length == 0) {
            return -1;
        }

        // only one value
        if (start == end) {
            return start;
        }

        // 2 elems start > end
        if (end == start + 1 && arr[start] > arr[end]) {
            return start;
        }

        // 2 elems start < end
        if (end == start + 1 && arr[start] < arr[end]) {
            return end;
        }

        // search with binary
        int m = start + (end - start) / 2;

        // checking neighbours
        if (arr[m] > arr[m + 1] && arr[m] > arr[m - 1]) {
            return m;
        } else if (arr[m] > arr[m + 1] && arr[m] < arr[m - 1]) {
            // may be decrement is between start and middle, so move end = m
            return findDecrementIndex(arr, start, m);
        } else {
            // may be decrement is between  middle and end, so move start = m+1
            return findDecrementIndex(arr, m + 1, end);
        }

    }
}
