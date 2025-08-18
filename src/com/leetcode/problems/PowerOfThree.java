package com.leetcode.problems;

public class PowerOfThree {

	public static void main(String[] args) {
		int n = 27;

		System.out.println(Math.log(n));
		System.out.println(Math.log(3));
		System.out.println(Math.log10(n) / Math.log10(3));
		System.out.println(isPowerOfThree(n));
	}

	static boolean isPowerOfThree(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}

	static boolean isPowerOfTwo(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}

	static boolean isPowerOfFour(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}

	// Bit Manipulation/Recursion/Math
	public boolean isPowerOfFour2(int n) {
		if (n == 1)
			return true;
		if (n <= 0 || n % 4 != 0)
			return false;
		return isPowerOfFour(n / 4);
	}

	// Bit Manipulation/Recursion
	public boolean isPowerOfTwo2(int n) {
		return n > 0 && Integer.bitCount(n) == 1;
	}
}
