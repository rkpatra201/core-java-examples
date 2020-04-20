package com.java.arrays.common;

public class StockBySellOneTransaction {
    public static void main(String[] args) {
        int arr[] = {10, 9, 3, 8, 1, 20, 6};

        int maxAt = 0;
        int minAt = 0;
        int maxDiff = -1;
        for (int i = 0; i < arr.length; i++) {
            int temp_maxDiff = arr[i] - arr[minAt];
            if (temp_maxDiff > maxDiff) {
                maxAt = i;
                maxDiff = temp_maxDiff;
            }

            if (arr[i] < arr[minAt]) {
                minAt = i;
            }
        }

        System.out.println("Min: " + arr[minAt] + " Max: " + arr[maxAt]);
    }
}
