package com.leetcode.problems;

public class FindMissingNumbers {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 0, 5 };
		System.out.println(missingNumber(arr));
	}

	static int missingNumber(int[] nums) {
		int n = nums.length;
		int xor = 0;

		for (int i = 0; i <= n; i++) {
			xor = xor^i;
		}

		for (int num : nums) {
			xor ^= num;
		}

		return xor;
	}
} 
