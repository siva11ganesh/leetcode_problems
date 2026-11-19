package com.blind75;

public class MissingNumber {

    private static int missingNumber(int[] num) {
        int len = num.length;
        int xor = 0;

        for (int i = 0; i <= len; i++) {
            xor ^= i;
        }

        for (int n : num) {
            xor ^= n;
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] num = {1,3,2,4,6,7,0};
        int missedNum = missingNumber(num);
        System.out.println(missedNum);
    }
}
