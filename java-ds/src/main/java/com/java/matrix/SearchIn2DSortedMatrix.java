package com.java.matrix;

import java.util.Arrays;

public class SearchIn2DSortedMatrix {
    public static void main(String[] args) {
        // make sure your elements are sorted always
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        searchElement(arr);

    }

    private static void searchElementArr(int[][] arr) {
        int searchValue = 10;
        for (int[] arrElement : arr) {// order of logn
            int lowValue = arrElement[0];
            int maxValue = arrElement[arrElement.length - 1];
            if (searchValue >= lowValue && searchValue <= maxValue) {
                System.out.println(Arrays.binarySearch(arrElement, searchValue));
            }
        }

    }

    private static void searchElement(int[][] arr) { // order of n
        int i = 0, j = 3;
        int searchVal = 9;
        while (i < 3 && j >= 0) {
            if (arr[i][j] == searchVal) {
                System.out.println("found at: " + "i: " + i + " j: " + j);
                return;
            } else if (arr[i][j] > searchVal) {
                j--;
            } else {
                i++;
            }
        }
    }
}
