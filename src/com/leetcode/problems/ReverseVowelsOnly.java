package com.leetcode.problems;

public class ReverseVowelsOnly {

	public static void main(String[] args) {
		String s = "SuperCommand";
		System.out.println(ReverseVowelsOnly.reverseVowels(s));
	}

	public static String reverseVowels(String s) {
		char[] chars = s.toCharArray();
		int left = 0;
		int  right = s.length() - 1;
		String vowels = "AEIOUaeiou";

		while (left < right) {
			while (left < right && vowels.indexOf(chars[left]) == -1) {
				left++;
			}
			while (left < right && vowels.indexOf(chars[right]) == -1) {
				right--;
			}
			if (left < right) {
				// Swap vowels
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;
				left++;
				right--;
			}
		}
		return new String(chars);
	}
}
