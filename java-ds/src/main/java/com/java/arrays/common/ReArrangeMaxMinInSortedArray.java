package com.java.arrays.common;

import java.util.Arrays;

public class ReArrangeMaxMinInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;

        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));

        rearrange(arr);

        System.out.print("\nModified Array\n");
        System.out.println(Arrays.toString(arr));
    }


    // Prints max at first position, min at second
    // position second max at third position, second
    // min at fourth position and so on.
    public static void rearrange(int arr[]) {
        // initialize index of first minimum and first
        // maximum element
        int n = arr.length;
        int max_idx = n - 1, min_idx = 0;

        // store maximum element of array
        int max_elem = arr[n - 1] + 1;

        // traverse array elements
        for (int i = 0; i < n; i++) {
            // at even index : we have to put
            // maximum element
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_elem) * max_elem;
                max_idx--;
            }
            // at odd index : we have to put minimum element
            else {
                arr[i] += (arr[min_idx] % max_elem) * max_elem;
                min_idx++;
            }
        }

        // array elements back to it's original form
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;
    }
}
