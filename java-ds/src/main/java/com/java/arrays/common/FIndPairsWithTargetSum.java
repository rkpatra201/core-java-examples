package com.java.arrays.common;

public class FIndPairsWithTargetSum {
    public static void main(String[] args) {
        int arr[] = {-12, -8, 1, 2, 3, 5, 6, 6, 16, 20};

        int l = 0;
        int r = arr.length - 1;
        int targetSum = 8;

        while (l < r) {
            if (arr[l] + arr[r] == targetSum) {
                System.out.println(arr[l] + " " + arr[r]);
                l++;
                r--;
            } else if (arr[l] + arr[r] < targetSum) {
                l++;
            } else {
                r--;
            }
        }
    }
}
