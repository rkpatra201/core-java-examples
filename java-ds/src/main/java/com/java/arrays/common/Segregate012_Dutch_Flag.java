package com.java.arrays.common;

import java.util.Arrays;

public class Segregate012_Dutch_Flag {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0, 2, 1, 1};
        int l = 0;
        int h = arr.length - 1;
        int m = 0;
        while (m <= h) {
            int midValue = arr[m];
            switch (midValue) {
                case 0:
                    swap(arr, l, m);
                    l++;
                    m++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    swap(arr, m, h);
                    h--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int i, int j) {
        if (i != j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}
