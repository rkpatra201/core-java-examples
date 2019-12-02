package com.java.arrays.rec.dp;

import java.util.Arrays;

public class DynamicFiboMain {
    public static void main(String[] args) {
        int arr[]=new int[5];// 5 elements of fibo.
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
