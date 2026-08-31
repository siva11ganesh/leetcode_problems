package com.leetcode.problems;

public class StrFirstOccurrence {

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        for (int i = 0, j = needle.length(); j <= haystack.length(); j++, i++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "but";

        System.out.println(StrFirstOccurrence.strStr(haystack, needle));
    }
}
