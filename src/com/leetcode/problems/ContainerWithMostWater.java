package com.leetcode.problems;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		System.out.println(maxWater(arr));

	}

	static int maxWater(int[] arr) {
		int maxWater = 0;
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int width = right - left;
			int min = Math.min(arr[left], arr[right]);
			int water = width * min;
			maxWater = Math.max(maxWater, water);
			if (arr[left] < arr[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxWater;
	}

}
