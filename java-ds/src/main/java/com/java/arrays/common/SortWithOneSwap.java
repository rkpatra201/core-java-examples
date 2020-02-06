package com.java.arrays.common;

import java.util.Arrays;

public class SortWithOneSwap {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 3, 5};//{1, 5, 3, 4, 2};
        canSortInOneSwap(arr);
        traverseFromBothEnd(arr);

    }

    private static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private static void canSortInOneSwap(int arr[]) {
        int firstAnamolyIndex = 0;
        int secondAnamolyIndex = 0;
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i - 1] > arr[i]))  // prev > current
            {
                count++;
                if (firstAnamolyIndex == 0) {
                    firstAnamolyIndex = i;
                } else {
                    secondAnamolyIndex = i;
                }
            }
        }

        if (count > 2) {
            System.out.println("cant be sorted with one swap");
            return;
        }
        if (count == 0) {
            System.out.println("array is sorted.");
            return;
        }
        if (count == 1) {
            // adjacent elements
            swap(arr, firstAnamolyIndex - 1, firstAnamolyIndex);
        }
        if (count == 2) {
            // some elements between firstAnamoly and secondAnamoly
            swap(arr, firstAnamolyIndex - 1, secondAnamolyIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void traverseFromBothEnd(int arr[]) {

        int leftAnamolyIndex = -1;
        int rightAnamolyIndex = -1;
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            if (arr[start] > arr[start + 1] && leftAnamolyIndex == -1) {
                leftAnamolyIndex = start;
            }

            if (arr[end] < arr[end - 1] && rightAnamolyIndex == -1) {
                rightAnamolyIndex = end;
            }
        }

        if (leftAnamolyIndex != -1 && rightAnamolyIndex != -1) {
            swap(arr, leftAnamolyIndex, rightAnamolyIndex);
            System.out.println(Arrays.toString(arr));
        }

    }
}
