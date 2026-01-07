package com.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 6, 8, 9 };
		int target = 10;

		System.out.println(Arrays.toString(twoSum(arr, target)));
		
		System.out.println(Arrays.toString(twoSum2(arr, target)));
	}

	static int[] twoSum(int[] arr, int k) {
		int len = arr.length;
		Map<Integer, int[]> hash = new HashMap<>();

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				hash.put(arr[i] + arr[j], new int[] { i, j });
			}
		}

		if (hash.containsKey(k)) {
			return hash.get(k);
		}

		return new int[] { -1, -1 };
	}

	static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No match");
    }
}
