package com.java.arrays.search;

public class BinarySearchMain {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int l = 0, h = arr.length - 1;
        int sv = 60;
        while (l < h) {
            int m = (l + h) / 2;
            int mv = arr[m];
            if (sv < mv) {
                h = m;
            } else if (sv > mv) {
                l = m;
            } else {
                System.out.println("found at index " + m);
                break;
            }
        }
    }
}
