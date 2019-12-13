package com.java.arrays.sequence;

import java.util.Arrays;

class LongestIncreasingSubSequenceLengthNLogn {
    // Binary search (note boundaries in the caller)
    // A[] is ceilIndex in the caller
    static int findWhereElementCanFit_BinarySearch(int A[], int l, int r, int key) {
        while (l<r) {
            int m = (l + r )/ 2;
            if (key <= A[m]) {
                r = m;
                r--;
            } else {
                l = m;
                l++;
            }
        }
        System.out.print(r);
        return r;
    }

    static int LongestIncreasingSubSequenceLength(int A[], int size) {
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
                // increase length of tail table and put a[i]
                tailTable[len++] = A[i];

            else {
                // A[i] wants to be current end candidate of an existing
                // subsequence. It will replace ceil value in tailTable
                int replaceIndex = findWhereElementCanFit_BinarySearch(tailTable, 0, len - 1, A[i]);
                tailTable[replaceIndex] = A[i];
            }
        }
        System.out.println(Arrays.toString(tailTable));
        return len;
    }

    // Driver program to test above function
    public static void main(String[] args) {
        // { 10, 22, 9, 33, 21, 50, 41, 60 }; lis length = 5
        // {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15} lis length = 6
        // {2, 5, 3, 7, 11, 8, 0, 10, 13, 6}; lis length = 6
        int A[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        int n = A.length;
        System.out.println("Length of Longest Increasing Subsequence is " + LongestIncreasingSubSequenceLength(A, n));
    }
}

