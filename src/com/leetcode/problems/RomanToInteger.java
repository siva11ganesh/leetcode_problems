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
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() - 1 && values.get(s.charAt(i)) < values.get(s.charAt(i + 1))) {
				answer -= values.get(s.charAt(i));
			} else {
				answer += values.get(s.charAt(i));
			}
		}
		return answer;
	}
}
