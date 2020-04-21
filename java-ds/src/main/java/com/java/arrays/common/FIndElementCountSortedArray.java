package com.java.arrays.common;

public class FIndElementCountSortedArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 4, 4, 4, 5, 5};
        int search = 5;
        int i = findFirst(arr, search);
        int j = findLast(arr, search);
        System.out.println(i + " " + j);
        System.out.println(search + " occurred: " + (j - i + 1));
    }

    private static int findLast(int[] arr, int x) {

        int l = 0;
        int h = arr.length -1;
        while (h >= l) {
            int mid = (l + h) / 2;
            if (x < arr[mid]) {
                h = mid; h--;
            } else if (x > arr[mid]) {
                l = mid; l++;
            } else {
                if (mid == h || x < arr[mid+1]) {
                    return mid;
                } else {
                    l = mid; l++;
                }
            }
        }
        return -1;
    }

    private static int findFirst(int[] arr, int x) {
        int l = 0;
        int h = arr.length -1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (x < arr[mid]) {
                h = mid; h--;
            } else if (x > arr[mid]) {
                l = mid; l++;
            } else {
                if (mid == 0 || arr[mid - 1] < x)
                    return mid;
                else {
                    h = mid; h--;
                }
            }
        }
        return -1;
    }
}
