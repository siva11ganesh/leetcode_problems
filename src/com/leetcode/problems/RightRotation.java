package com.leetcode.problems;

import java.util.Arrays;

public class RightRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int target = 3;
		rightRotate(arr, target);
		System.out.println(Arrays.toString(arr));
	}

	// Same logic for left or right rotation
	// Optimized in-place right rotation
	static void rightRotate(int[] arr, int k) {
		int len = arr.length;

		// If the rotation count is greater than the length, reduce it to avoid
		// unnecessary rotations
		k = k % len;

		if (k == 0)
			return; // No rotation needed if k is 0 or a multiple of the array length

		// Step 1: Reverse the entire array
		reverse(arr, 0, len - 1);

		// Step 2: Reverse the first 'k' elements
		reverse(arr, 0, k - 1);

		// Step 3: Reverse the remaining 'len - k' elements
		reverse(arr, k, len - 1);
	}

	// Helper function to reverse elements in an array between two indices
	static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
