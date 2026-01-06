package com.easyproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int num : nums1) s1.add(num);
        for (int num : nums2) {
            if (s1.contains(num)) {
                s2.add(num);
            }
        }
        return s2.stream().mapToInt(Integer::intValue).toArray();
    }
}
