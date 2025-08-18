package com.leetcode.problems;

public class ReverseArrayString {

	private ReverseArrayString() {
	}

	static char[] s = { 'h', 'e', 'l', 'l', 'o' };

	public static void main(String[] args) {
		System.out.println(s);
		ReverseArrayString.reverseString(s);
		System.out.println(s);
	}

	static void reverseString(char[] s) {

		int left = 0;
		int right = s.length - 1;
		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
	}

}
