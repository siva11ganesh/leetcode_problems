package com.leetcode.problems;

public class IntegerToRoman {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(intToRoman(num));
	}

	static String intToRoman(int num) {
		int[] n = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] s = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int i = 0;
		StringBuilder str = new StringBuilder();
		while (num > 0) {
			if (num >= n[i]) {
				str = str.append(s[i]);
				num -= n[i];
			} else {
				i++;
			}
		}
		return str.toString();
	}
}
