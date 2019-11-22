package com.java.arrays.sort;

import java.util.Arrays;

public class QuickSortHorare {
    public static void main(String[] args) {
        int arr[] = {44, 20, 5,45, 7, 23, 45};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int arr[], int l, int h) {
        if (l < h) {
            int p = partition(arr, l, h);
            quickSort(arr, l, p);
            quickSort(arr, p + 1, h);
        }
    }

    private static int partition(int arr[], int l, int h) {
        int i = l - 1;
        int j = h + 1;
        int pivot = arr[l];
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot); // ascedning or descending
            do {
                j--;
            } while (arr[j] > pivot); // ascending or descending

            if (i >= j) {
                return j;
            }
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}
