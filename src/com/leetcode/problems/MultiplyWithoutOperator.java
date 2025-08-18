package com.leetcode.problems;

public class MultiplyWithoutOperator {

	public static void main(String[] args) {
		int a = 4;
		int b = -20;

		System.out.println(multiplyWithoutOperator(a, b));

		System.out.println(multiply(a, b));
	}

	static int multiplyWithoutOperator(int a, int b) {
		int result = 0;
		while (a != 0) {
			result = result + b;
			a--;
		}
		return result;
	}

	static int multiply(int a, int b) {
		// Handle negative numbers
		if (b < 0) {
			return -multiply(a, -b);
		}
//		System.out.println(b);
		// Base case
		if (b == 0) {
			return 0;
		}

		// Recursive case
		return a + multiply(a, b - 1);
	}
}
