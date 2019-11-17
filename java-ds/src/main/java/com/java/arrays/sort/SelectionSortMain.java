package com.java.arrays.sort;

import java.util.Arrays;

public class SelectionSortMain {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1};

        for(int i=0;i < arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                 swap(arr,i,j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int []arr, int i , int j)
    {
        int t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
