package com.java.arrays.common;

public class SmallestUnSortedSubArray {
    public static void main(String[] args) {

      //  int arr[] = {1, 2, 4, 5, 3};
//        int arr[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int arr[] = {1,2,3,10,9,78,68,101,90,100,1000};
        printSmallestUnSortedSubArray(arr);
    }

    private static void printSmallestUnSortedSubArray(int[] arr) {
        int startAnamoly = 0;
        boolean isSorted = true;
        // find the first anamoly point from start
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) // prev > current is not valid
            {
                startAnamoly = i;
                isSorted = false;
                break;
            }
        }
        if (isSorted) { // visited the complete array
            System.out.println("array is sorted");
            return;
        }

        int endAnamoly = arr.length - 1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) // current < prev is invalid
            {
                endAnamoly = i;
                break;
            }
        }


        int maxAnamoly = arr[startAnamoly];
        int minAnamoly = arr[startAnamoly];
        // find the max and min between startAnamoly and endAnamoly
        for (int i = startAnamoly + 1; i <= endAnamoly; i++) {
            if (arr[i] > maxAnamoly) maxAnamoly = arr[i];
            if (arr[i] < minAnamoly) minAnamoly = arr[i];
        }

        // find the index of largerElement(element > minAnamoly) between
        // value at 0 and startAnamoly
        for (int i = 0; i < startAnamoly; i++) {
            if (arr[i] > minAnamoly) {
                startAnamoly = i;
                break;
            }
        }

        // find the index of smallerElement(element < maxAnamoly) between
        // endAnamoly+1 and arr.length -1
        for (int i = endAnamoly + 1; i < arr.length; i++) {
            if (arr[i] < maxAnamoly) {
                endAnamoly = i;
                break;
            }
        }

        System.out.println(startAnamoly);
        System.out.println(endAnamoly);

    }
}
