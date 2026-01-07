package com.easyproblems;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 1};
        int k = 3;
        //System.out.println(removeElement(nums, k));

        System.out.println(Arrays.toString(removeElementArr(nums, k)));
    }

    public static int removeElement(int[] nums, int k) {
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != k) {
                nums[val] = nums[i];
                val++;
            }
        }
        return val;
    }

    static int[] removeElementArr(int[] nums, int k) {
        int[] val = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != k) {
                val[i] = nums[i];
            } else {
                val[i] = 0;
            }
        }

        return val;
    }
}
