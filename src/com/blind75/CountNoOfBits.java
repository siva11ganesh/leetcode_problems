package com.blind75;

import java.util.Arrays;

/**
 * Author: Sivaganesh S
 * Date:10/7/2025
 */

public class CountNoOfBits {

    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int sub = 1;

        for (int i = 1; i <= n; i++) {
            if (sub * 2 == i) {
                sub = i;
            }

            dp[i] = dp[i - sub] + 1;
        }
        return dp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));

    }
}
