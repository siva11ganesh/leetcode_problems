package com.dsa_cheat_sheet.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {

        int len = nums.length;
        int left = 0;
        for (int right = 0; right < len; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
}
