package com.java.arrays.sort;

import java.util.Arrays;

public class QuickSortLomutoMain {
    public static void main(String[] args) {
        int arr[] = {10, 40, 2, 9, 24, 43, 6, 77, 8, 81, 24};
        arr = new int[]{10, 40, 2, 9, 24};
        int l = 0;
        int h = arr.length - 1;
        quickSort(arr, l, h);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int l, int h) {
        if (l < h) {
            // get partitionPivotLast index as i.
            // recursively divide arr between l and i-1
            // recursively divide arr between i+1 and h

           //    int j = partitionPivotLast(arr, l, h);
            int j = partitionPivotFirst(arr, l, h);
            quickSort(arr, l, j - 1);
            quickSort(arr, j + 1, h);
        }
    }

    public static int partitionPivotFirst(int arr[], int l, int h) {
        // take i as l
        // initialize pivot = arr[l];
        // for j = l+1 to j <= h
            // if arr[j] < pivot increment i++ and swap a[i] a[j]
        // swap a[i] and a[l] : a[l] is pivot
        // return i;
        int i = l;
        int pivot = arr[l];
        for (int j = l + 1; j <= h; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i, l);
        return i;
    }

    public static int partitionPivotLast(int arr[], int l, int h) {

        // take i as l-1
        // initialize pivot = arr[h];
        // for j = l to j < h
        // if arr[j] < pivot increment i++ and swap a[i] a[j]
        // swap a[i+1] and a[h]
        // return i+1;

        int i = l - 1;
        int pivot = arr[h]; //(arr[h] + arr[l]) / 2;
        for (int j = l; j <= h; j++) {
            if (arr[j] < pivot) { // > for descending. < for ascending order.
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, h);
        return i + 1;
    }

    private static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
/**
 * 10, 40, 2, 9, 43, 6, 77, 8, 81, 24
 * partitionPivotLast(arr,l,h){
 * l=0; h = 9
 * <p>
 * i = l-1;
 * pivot = arr[h]=24;
 * j = l to j < h
 * <p>
 * traverse from j=l to j <h
 * check if a[i] < pivot then increment i and swap(a[i],a[j])
 * swap(a[i+1],a[h])// pivot and i next position swapped.
 * return i+1;
 * <p>
 * {10, 40, 2, 9, 43, 6, 77, 8, 81, 24};
 * i=-1, j=0, 10 < 24, i++ no swap as i == j
 * i = 0, j = 1, 40 > 24
 * i = 0, j=2, 2 < 24, i++, swap 10,2,40,9,43,6,77,8,81,24
 * i = 1, j = 3, 9 < 24, i++ swap 10,2,9,40,43,6,77,8,81,24
 * i = 2, j =4 , 43 > 24
 * i=2, j =5 , 6 < 24, i++ swap 10,2,9,6,43,40,77,8,81,24
 * i=3, j=6, 77 > 24
 * i = 3, j = 7, 8 < 24, i++ swap 10,2,9,6,8,40,77,43,81,24
 * i=4, j=8 , 81 > 24
 * <p>
 * --end of for loop
 * swap data at pivot index and sorted left side i next position(i+1)
 * swap(arr[i+1],arr[h])
 * return i+1; // i+1=5
 * 10,2,9,6,8,24,77,43,81,40
 * }
 * <p>
 * int p = partitionPivotLast(arr,l,h);
 * quickSort(arr,l,p-1);
 * quickSort(arr,p+1,h);
 * <p>
 * sout(arr);
 */