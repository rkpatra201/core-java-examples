package com.java.arrays.search;

public class WhichIndexCanBeReplacedInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 15, 19, 34};
        int replaceValue = 18;

        int l = 0;
        int h = arr.length - 1;
        while (l < h) {
            int m = (l + h) / 2;
            int mv = arr[m];
            if (replaceValue <= mv) {
                h = m;
                h--;
            } else {
                l = m;
                l++;
            }
        }
        System.out.println(h);
        System.out.println(l);
    }
}
