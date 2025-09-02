package com.blind75.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(num);

        for (int i = 0; i < num.length - 2; i++) {
            if (i > 0 && num[i] == num[i - 1]) continue;

            int left = i + 1, right = num.length - 1;
            while (left < right) {
                int total = num[i] + num[left] + num[right];
                if (total == 0) {
                    res.add(Arrays.asList(num[i], num[left], num[right]));
                    while (left < right && num[left] == num[left + 1]) left++;
                    while (left < right && num[right] == num[right - 1]) right--;
                    left++;
                    right--;
                } else if (total < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(arr));
    }
}
