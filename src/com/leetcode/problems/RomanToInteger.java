package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        String s = "MCMXCV";
        System.out.println(romanToInt(s));
    }

    static int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = values.get(s.charAt(i));
            int next = i + 1 < s.length() ? values.get(s.charAt(i + 1)) : 0;
            total += curr < next ? -curr : curr;
        }
        return total;
    }
}
