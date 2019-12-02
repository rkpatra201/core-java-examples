package com.java.arrays.common;

import java.util.Arrays;

public class ReArrange_Array_i_is_Arr_Arr_i__ {
    // arr[i] = arr[arr[i]]
    public static void main(String[] args) {
        int arr[] = {1,0,2,3};// element values must be less than length
        // i.e arr[i] < n

        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            arr[i]+=(arr[arr[i]]%n)*n;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]/n;
        }
        System.out.println(Arrays.toString(arr));
    }
}
