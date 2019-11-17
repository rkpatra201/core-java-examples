package com.java.arrays.search.sort;

import java.util.Arrays;

public class QuickSortMain {
    public static void main(String[] args) {
        int arr[] = {10, 40, 2, 9, 24, 43, 6, 77, 8, 81, 24};
        int l = 0;
        int h = arr.length - 1;
        quickSort(arr, l, h);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int l, int h) {
        if (l < h) {
            int j = partition(arr, l, h);
            quickSort(arr, l, j - 1);
            quickSort(arr, j + 1, h);
        }
    }

    public static int partition(int arr[], int l, int h) {

        int i = l - 1;
        int pivot = arr[h];
        for (int j = l; j < h; j++) {
            if (arr[j] < pivot) {
                i++;
                if (i < j) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        int t = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = t;
        return i + 1;
    }

}
/**
 * 10, 40, 2, 9, 43, 6, 77, 8, 81, 24
 * partition(arr,l,h){
 * l=0; h = 9
 * <p>
 * i = l-1;
 * pivot = arr[h]=24;
 * j = l to j < h
 *
 * traverse from j=l to j <h
 *   check if a[i] < pivot then increment i and swap(a[i],a[j])
 * swap(a[i+1],a[h])// pivot and i next position swapped.
 * return i+1;
 * <p>
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
 * int p = partition(arr,l,h);
 * quickSort(arr,l,p-1);
 * quickSort(arr,p+1,h);
 * <p>
 * sout(arr);
 */