package com.java.arrays.rec.dp;

import java.util.Arrays;

public class ReverseArrayRecursiveMain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverseArr(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArr(int[] arr, int i, int j)
    {
        if(i<j)
        {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            reverseArr(arr, ++i, --j);
        }
    }
}
