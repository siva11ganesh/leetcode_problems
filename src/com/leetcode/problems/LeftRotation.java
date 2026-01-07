package com.leetcode.problems;

import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
//		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int target = 3;
        leftRotation(arr, target);
        System.out.println("Final:" + Arrays.toString(arr));
    }

    static void leftRotation(int[] arr, int k) {
        int len = arr.length;

        k = k % len;

        if (k == 0)
            return;

        reverse(arr, 0, len - 1); // entire list will be reversed

        System.out.println("1:" + Arrays.toString(arr));

        reverse(arr, 0, k - 1); // kth length will be reversed on top the reversed list

        System.out.println("2:" + Arrays.toString(arr));

        reverse(arr, k, len - 1); // reverse it to normal after kth position
    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
