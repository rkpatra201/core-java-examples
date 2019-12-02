package com.java.arrays.common;

public class StockBuySell {
    public static void main(String[] args) {
        int arr[] = {3, 5, 3, 4, 2, 7, 9, 6};
        //  System.out.println("Maximum profit :" + calculateMaxProfit(arr));
        int lowestPriceTillDay = arr[0];
        int maxProfit = 0;
        int sellDay = 0;
        int buyDay = 0;
        for (int i = 1; i < arr.length; i++) {
            int profit = 0;
            // check if the currentDay price is more than buyPrice(low)
            if (arr[i] > lowestPriceTillDay) {
                profit = arr[i] - lowestPriceTillDay;
                // when profit occurs then sell that day
                if (profit > maxProfit) {
                    maxProfit = profit;
                    sellDay = i;
                }
            } else {
                lowestPriceTillDay = arr[i];
                buyDay = i;
            }
        }
        System.out.println(buyDay + " " + sellDay + " profit: " + maxProfit);
    }
}
