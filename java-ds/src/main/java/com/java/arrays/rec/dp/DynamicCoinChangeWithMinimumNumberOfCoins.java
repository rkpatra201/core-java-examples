package com.java.arrays.rec.dp;

import java.util.Arrays;

public class DynamicCoinChangeWithMinimumNumberOfCoins {
    public static void main(String[] args) {
        int coins[] = {1, 5, 6, 9}; // infinite number of similar coins supplied
        int sum = 19;
        tabularApproach(coins, sum);
        arrayApproach(coins, sum);
    }

    public static void arrayApproach(int[] coinValues, int sum) {
        int table[] = new int[sum + 1];
        Arrays.fill(table, Integer.MAX_VALUE);
        table[0] = 0; // when sum is 0;

        for (int i = 0; i < coinValues.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j >= coinValues[i]) {
                    int coinAwayValue = table[j - coinValues[i]] + 1;
                    int currentValue = table[j];
                    table[j] = Math.min(coinAwayValue, currentValue);
                }
            }
        }
        System.out.println(table[sum]);
    }

    public static void tabularApproach(int[] coins, int sum) {
        int[][] table = new int[coins.length + 1][sum + 1];

        for (int i = 0; i < coins.length + 1; i++) {
            table[i][0] = 0;
        }
        for (int j = 1; j < sum + 1; j++) {
            table[0][j] = table[0][j - 1] + 1;
        }
        for (int coinIndex = 1; coinIndex <= coins.length; coinIndex++) {
            int coinValue = coins[coinIndex - 1];
            for (int j = 1; j <= sum; j++) {
                int topValue = table[coinIndex - 1][j];
                if (j >= coinValue) {
                    int valueOnSameRowAtCoinValueWayFromCurrentCell = 1 + table[coinIndex][j - coinValue];
                    table[coinIndex][j] = Math.min(topValue, valueOnSameRowAtCoinValueWayFromCurrentCell);
                } else {
                    table[coinIndex][j] = topValue;
                }
            }
        }
        System.out.println(table[coins.length][sum]);
    }
}
