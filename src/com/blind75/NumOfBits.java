package com.blind75;

public class NumOfBits {

    private static int hammingWeight(int n) {
        int ones = 0;
        while (n != 0) {
            ones = ones + (n & 1);
            n = n >>> 1;
        }
        return ones;
    }

    public static void main(String[] args) {
        int i = hammingWeight(11);
        System.out.println(i);
    }

}
