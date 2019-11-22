package com.java.arrays.search;

public class BinarySearchMain {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int l = 0, h = arr.length - 1;
        int sv = 61;

        boolean flag = false;
        while (l < h) {
            int m = (l + h) / 2;
            int mv = arr[m];
            if (sv < mv) {
                h = m;
                h--; // decrease high
            } else if (sv > mv) {
                l = m;
                l++; // increase low
            } else {
                flag=true;
                System.out.println("found at index " + m);
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("not found");
        }
    }
}
