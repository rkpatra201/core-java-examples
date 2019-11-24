package com.java.arrays.common;

import java.util.Arrays;

class LongestIncreasingSubSequenceLengthNLogn {
    // Binary search (note boundaries in the caller)
    // A[] is ceilIndex in the caller
    static int CeilIndex(int A[], int l, int r, int key) {
        while (r -l > 1) {
            int m = l + (r - l) / 2;
            if (A[m] >= key) {
                r = m;
            }
            else {
                l = m;
            }
        }

        return r;
    }

    static int LongestIncreasingSubsequenceLength(int A[], int size) {
        // Add boundary case, when array size is one

        int[] tailTable = new int[size];
        int len; // always points empty slot

        tailTable[0] = A[0];
        len = 1;
        for (int i = 1; i < size; i++) {
            if (A[i] < tailTable[0])
                // new smallest value
                tailTable[0] = A[i];

            else if (A[i] > tailTable[len - 1])
                // A[i] wants to extend largest subsequence
                tailTable[len++] = A[i];

            else
                // A[i] wants to be current end candidate of an existing
                // subsequence. It will replace ceil value in tailTable
                tailTable[CeilIndex(tailTable, -1, len - 1, A[i])] = A[i];
        }

        System.out.println(Arrays.toString(tailTable));
        return len;
    }

    // Driver program to test above function
    public static void main(String[] args) {
        // { 10, 22, 9, 33, 21, 50, 41, 60 }; lis length = 5
        // {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15} lis length = 6
        // {2, 5, 3, 7, 11, 8, 0, 10, 13, 6}; lis length = 6
        int A[] = {2, 5, 3, 7, 11, 8, 0, 10, 13, 6};
        int n = A.length;
        System.out.println("Length of Longest Increasing Subsequence is " + LongestIncreasingSubsequenceLength(A, n));
    }
}

