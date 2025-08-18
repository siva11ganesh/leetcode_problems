package com.leetcode.problems;

import java.util.Arrays;

public class SqrtOfNums {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 7 };
		System.out.println(Arrays.toString(sqrtOfNums2(arr)));
	}

	// Sorted array without -ve a*a = n
	static int[] sqrtOfNums(int[] arr) {
		int len = arr.length;
		int i = 0;
		int[] temp = new int[len];
		for (int a : arr) {
			temp[i] = a * a;
			i++;
		}
		return temp;
	}

	// Sorted array with -ve a*a = n
	static int[] sqrtOfNums2(int[] arr) {
		int len = arr.length;
		int left = 0;
		int right = len - 1;
		int index = right;
		int[] temp = new int[len];
		while (left <= right) {
			int leftSquare = arr[left] * arr[left];
			int rightSquare = arr[right] * arr[right];

			if (leftSquare > rightSquare) {
				temp[index--] = leftSquare;
				left++;
			} else {
				temp[index--] = rightSquare;
				right--;
			}
		}
		return temp;
	}

}
