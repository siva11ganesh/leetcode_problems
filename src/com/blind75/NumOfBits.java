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

    //Brian Kernighan’s Algorithm
    private static int hammingWeight2(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); //This operation turns off (clears) the rightmost set bit (1) in n
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int i = hammingWeight(11);
        System.out.println(i);

        int j = hammingWeight2(11);
        System.out.println(j);

        System.out.println(Integer.bitCount(11));
    }

}
