package com.java.arrays.common;


import java.util.Arrays;

public class NthMinimumInArray {
    // see quick sort-horare
    public static void main(String[] args) {
        int arr[] = {2, 6, 1, 8, 9, 10, 11,2};

        // 1,2,2,6,8,9,10,11
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int arr[], int l, int h) {
        if (l < h) {
            int p = partition(arr, l, h);
            if (p == 4)// 3rd minimum is 8 and
            // will come at 4th index in sorted array, as 2 is repeated
            {
                System.out.println(arr[p]);
                return;
            }
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
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}
