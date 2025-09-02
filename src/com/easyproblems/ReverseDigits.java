package com.easyproblems;

public class ReverseDigits {

    /**
     * Time Complexity - O(log n)
     * Space Complexity - O(1)
     */
    static int reverseDigits(int n) {
        boolean isNegative = n < 0;
        n = Math.abs(n);
        int reverse = 0;
        while (n > 0) {
            int last = n % 10;
            reverse = reverse * 10 + last;
            n = n / 10;
        }
        return isNegative ? -reverse : reverse;
    }

    /**
     * Time Complexity - O(log n)
     * Space Complexity - O(log n)
     */
    static void reverseDigits(int n, int[] revNum, int[] basePos) {
        if (n > 0) {
            reverseDigits(n / 10, revNum, basePos);
            // Add current digit with its base position
            revNum[0] += (n % 10) * basePos[0];
            basePos[0] *= 10;
        }
    }

    public static void main(String[] args) {
        int num = 122;
        System.out.println(reverseDigits(num));

        int[] revNum = {0};
        int[] basePos = {1};
        reverseDigits(num, revNum, basePos);
        System.out.println(revNum[0]);
    }
}
