package com.java.arrays.rec.dp;

public class SumOfTwoNumbersWithRecursion {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
    }

    private static int sum(int x, int y) {
        if (y == 0)
            return 0;
        else {
            y--;
            return sum(x, y) + x;
        }
    }
}
