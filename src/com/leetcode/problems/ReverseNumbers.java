package com.leetcode.problems;

public class ReverseNumbers {

	public static void main(String[] args) {
		int a = 123456;
		System.out.println(reverseNumber(a));
	}

	static int reverseNumber(int num) {
		long rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = 10 * rev + digit;
			if (rev > Integer.MAX_VALUE)
				return 0;
			if (rev < Integer.MIN_VALUE)
				return 0;
			num /= 10;
		}
		return (int) rev;
	}

}
