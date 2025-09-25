package com.blind75.slidingwindow;

//Maximum sum of a subarray of size k
public class MaximumSum {

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 3;

        System.out.println(maxSubarraySum(arr, k));
    }

    static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int maxSum = 0;

        for (int i = 0; i <= n - k; i++) {
            int currSum = 0;

            // compute sum of current sub-array
            for (int j = 0; j < k; j++) {
                currSum += arr[i + j];
            }

            // update maximum sum
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
