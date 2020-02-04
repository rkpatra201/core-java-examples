package com.java.arrays.rec.dp;

public class RecursiveClimbStairs {
    public static void main(String[] args) {

        System.out.println(climbStairs(6));
    }

    public static int climbStairs(int n) {
        if (n == 0 ) { // base case
            return 1;
        }
        else if (n < 0) { // base case
            return 0;
        }
        return climbStairs(n - 3) + climbStairs(n - 2) + climbStairs(n - 1);
    }
}
