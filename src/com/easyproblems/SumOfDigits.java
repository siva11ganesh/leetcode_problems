package com.easyproblems;

public class SumOfDigits {

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum += last;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 687;
        System.out.println(sumOfDigits(num));
    }
}
