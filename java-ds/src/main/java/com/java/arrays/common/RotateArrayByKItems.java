package com.java.arrays.common;

import java.util.Arrays;

public class RotateArrayByKItems {
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 2, 8, 9, 2, 9, 1};
        // rotate from first by 3 elements
        // reverse array by parts
        int k =3;
        int totalLength = arr.length - 1;
        reverseArray(arr,0,totalLength);
        System.out.println(Arrays.toString(arr));
        reverseArray(arr,0,totalLength-k);
        System.out.println(Arrays.toString(arr));
        reverseArray(arr, totalLength-k+1, totalLength);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int arr[], int i, int j) {
        if (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
            reverseArray(arr, i, j);
        }
    }
}
