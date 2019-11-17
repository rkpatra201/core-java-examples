package com.java.arrays.search;

public class BinarySearchRecursionMain {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int l = 0, h = arr.length - 1;
        int sv = 60;
        recursiveBinarySearch(arr, sv, l, h);
    }

    public static void recursiveBinarySearch(int arr[], int sv, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            int mv = arr[m];
            if (sv < mv) {
                h = m;
                h--;
            } else if (sv > mv) {
                l = m;
                l++;
            } else {
                System.out.println("found at index " + m);
                return;
            }
            recursiveBinarySearch(arr, sv, l, h);
        }
        else
        {
            System.out.println("not found");
            return;
        }
    }
}
