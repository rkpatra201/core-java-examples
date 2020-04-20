package com.java.arrays.common;


// always find the incorrect place.

/**
 * incorrect place means an element not placed at its
 * index.
 * so check incorrect place at left.
 * when left is incorrect all its right or mid is incorrect.
 * so right = mid
 * <p>
 * check incorrect place at middle.
 * when middle is at incorrect place, all its right is correct.
 * so right=mid.
 * <p>
 * check incorrect place at right.
 * when right is at incorrect place, all its left are incorrect.
 * so left = mid
 * <p>
 * so this ordering check matters
 * left mid right
 */
public class MissingNumberBinarySearch {
    public static void main(String[] args) {
        //{1, 3, 4, 5}
        //{1,3}

        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};

        int left = 0;
        int right = arr.length - 1;

        int missingValue = binarySearch(left, right, arr);
        System.out.println(missingValue);
    }

    public static int binarySearch(int left, int right, int[] arr) {
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;

            if (right - left == 1) {
                break;
            }
            if (arr[left] - left > 1) {
                right = mid;
            } else if (arr[mid] - mid > 1) {
                right = mid;
            } else if (arr[right] - right > 1) {
                left = mid;
            }

            if (left == 0 && right == arr.length - 1) {
                break;
            }
        }

        if (right - left == 1) {
            return (arr[right] + arr[left]) / 2;
        }
        return -1;
    }

}
