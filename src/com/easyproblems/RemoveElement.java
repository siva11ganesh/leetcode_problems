package com.easyproblems;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int k = 3;
        System.out.println(removeElement(nums, k));
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
}
