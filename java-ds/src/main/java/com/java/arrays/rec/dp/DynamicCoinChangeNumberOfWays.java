package com.java.arrays.rec.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicCoinChangeNumberOfWays {
    // tabular approach with 2d array
    public int numberOfSolutions(int total, int coins[]) {
        int numberOfWays[][] = new int[coins.length + 1][total + 1];
        for (int i = 0; i <= coins.length; i++) {
            numberOfWays[i][0] = 1;
        }
        for (int numWay[] : numberOfWays) {
            System.out.println(Arrays.toString(numWay));
        }
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= total; j++) {
                int coinValue = coins[i - 1];
                if (j < coinValue) {
                    // copy from top row.
                    numberOfWays[i][j] = numberOfWays[i - 1][j];
                } else {
                    // value at (currentPos - coinValue) + value at top
                    numberOfWays[i][j] = numberOfWays[i][j - coinValue] + numberOfWays[i - 1][j];
                }
            }
        }
        return numberOfWays[coins.length][total];
    }

    /**
     * better space solution: use 1d array
     */
    public int numberOfSolutionsOnSpace(int sum, int coinValues[]) {

        int numberOfWays[] = new int[sum + 1];

        numberOfWays[0] = 1;
        for (int i = 0; i < coinValues.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j >= coinValues[i]) {
                    int coinAwayValue = numberOfWays[j - coinValues[i]];
                    int currentValue = numberOfWays[j];
                    numberOfWays[j] = coinAwayValue + currentValue;
                }
            }
        }
        return numberOfWays[sum];
    }

    /**
     * This method actually prints all the combination. It takes exponential time.
     */
    public void showUniqueWaysOfCoinChanging(int total, int coins[]) {
        List<Integer> result = new ArrayList<>();
        printUniqueWays(result, total, coins, 0);
    }

    private void printUniqueWays(List<Integer> result, int total, int coins[], int pos) {
        if (total == 0) {
            for (int r : result) {
                System.out.print(r + " ");
            }
            System.out.print("\n");
        }
        for (int i = pos; i < coins.length; i++) {
            if (total >= coins[i]) {
                result.add(coins[i]);
                printUniqueWays(result, total - coins[i], coins, i);
                result.remove(result.size() - 1);
            }
        }
    }

    public static void main(String args[]) {
        DynamicCoinChangeNumberOfWays coinChangeNumberOfWays = new DynamicCoinChangeNumberOfWays();
        int total = 11;
        int coins[] = {1, 5,6,8};
        System.out.println(coinChangeNumberOfWays.numberOfSolutions(total, coins));
        System.out.println(coinChangeNumberOfWays.numberOfSolutionsOnSpace(total, coins));
        coinChangeNumberOfWays.showUniqueWaysOfCoinChanging(total, coins);
    }
}
