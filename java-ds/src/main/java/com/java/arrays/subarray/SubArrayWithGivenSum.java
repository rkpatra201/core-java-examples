package com.java.arrays.subarray;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        // map that contains currentSum and index
        Map<Integer, Integer> map = new HashMap<>();
        int targetSum = -22;

        int currentSum = 0;
        int start = 0;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            // evaluate sum of each element
            currentSum = currentSum + arr[i];
            // check if currentSum - targetSum=0; start=0;end=i
            int difference = currentSum - targetSum;
            if (difference == 0) {
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(difference)) {
                start = map.get(difference) + 1;
                end = i;
                break;
            }
            map.put(currentSum, i);
        }
        if (end == -1) {
            System.out.println("no subarray found");
        } else {
            System.out.println("subarray found between start: " + start + " end: " + end);
        }
    }
}
