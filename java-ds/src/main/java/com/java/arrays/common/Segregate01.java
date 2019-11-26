package com.java.arrays.common;

import java.util.Arrays;

public class Segregate01 {
    public static void main(String[] args) {
        int[] arr={1,0,1,0};
        int count1=0;
        int count0=0;
        for(int i:arr)
        {
            if(i==1)
            {
                count1++;
            }
            if(i==0)
            {
                count0++;
            }
        }

        for(int i=0;i<count1;i++)
        {
            arr[i]=1;
        }
        for(int i=count1;i<count0+count1;i++)
        {
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
