package com.java.arrays.rec.dp;

public class RecursiveClimbStairs {
    public static void main(String[] args) {

        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 2;
        }
        return climbStairs(n - 3) + climbStairs(n - 2) + climbStairs(n - 1);
    }
}
