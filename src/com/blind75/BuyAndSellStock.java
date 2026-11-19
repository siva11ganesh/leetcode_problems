package com.blind75;

public class BuyAndSellStock {

    private static int maxProfit(int[] prices) {
        int min_price = prices[0];
        int maxprof = 0;

        for (int i = 1; i < prices.length; i++) {
            maxprof = Math.max(maxprof, prices[i] - min_price);
            min_price = Math.min(prices[i], min_price);
        }

        return maxprof;
    }

    public static void main(String[] args) {
        int[] num = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(num));
    }
}
