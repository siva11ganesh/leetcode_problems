package com.dsa_cheat_sheet.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;

        int left = 0, right = len - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
