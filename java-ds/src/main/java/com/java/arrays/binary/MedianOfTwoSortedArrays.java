package com.java.arrays.binary;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 5, 7, 8, 9};
        int arr2[] = {2, 5, 10, 11, 12, 13, 14};

        // 1, 2, 4, 5, 5, 6, 8, 9, 10, 11, 12, 13, 14 = 8
        //
        // 1, 2, 4, 5, 5, 6, 8, 9, 10, 11, 12, 13 = 7.0
        // number of elements in left of X = (start + end ) /2 = k
        // number of elements in left of Y = (x.length+y.length+1)/2 - k

        int xLen = arr1.length;
        int yLen = arr2.length;

        int low = 0;
        int high = xLen;

        while (low <= high) {
            int partitionOfX = (low + high) / 2;
            int partitionOfY = (xLen + yLen + 1) / 2 - partitionOfX;

            int maxLeftX = partitionOfX == 0 ? Integer.MIN_VALUE : arr1[partitionOfX - 1];
            int minRightX = partitionOfX == xLen ? Integer.MAX_VALUE : arr1[partitionOfX];

            int maxLeftY = partitionOfY == 0 ? Integer.MIN_VALUE : arr2[partitionOfY - 1];
            int minRightY = partitionOfY == yLen ? Integer.MAX_VALUE : arr2[partitionOfY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                boolean isSumOfTwoArraySizeIsEven = (xLen + yLen) % 2 == 0;
                if (isSumOfTwoArraySizeIsEven) {
                    int median1 = Math.max(maxLeftX, maxLeftY);
                    int median2 = Math.min(minRightX, minRightY);
                    double result = (median1 + median2) / 2;
                    System.out.println(result);
                    break;
                } else {
                    int median = Math.max(maxLeftX, maxLeftY);
                    System.out.println(median);
                    break;
                }
            } else if (maxLeftX > minRightY) {
                high = partitionOfX - 1;
            } else {
                low = partitionOfX + 1;
            }

        }
    }
}
