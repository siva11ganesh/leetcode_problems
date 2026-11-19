package com.easyproblems;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        System.out.println(containsDuplicate(a));
        ;
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.contains(num)) {
                seen.add(num);
            } else {
                return true;
            }
        }
        return false;
    }
}
