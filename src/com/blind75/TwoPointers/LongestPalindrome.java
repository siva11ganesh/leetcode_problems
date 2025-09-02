package com.blind75.TwoPointers;

//Solution: "Expanding from the center"
//The idea is that every palindrome has a "center".
//For an odd length (like "bab"), the center is a single letter ("a").
//For an even length (for example, "abba"), the center is between two letters ("bb").
//
//The algorithm:
//We go through each character of the string.
//For each character, we try to "expand" left and right until the characters match.
//First, we check the case of an odd palindrome (the center is one letter).
//Then we check the case of an even palindrome (the center is two letters).
//Memorize the longest found palindrome.

public class LongestPalindrome {

    // A method for "expanding" from the center and finding the length of a palindrome
    public static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; // going left
            right++; // go to the right
        }
        // Returning the length of the palindrome
        return right - left - 1;
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return ""; // checking for an empty string

        int start = 0, end = 0; // start and end of the longest palindrome

        for (int i = 0; i < s.length(); i++) {
            // Checking an odd-length palindrome (for example, "bab")
            int len1 = expand(s, i, i);
            // Checking an even-length palindrome (for example, "abba")
            int len2 = expand(s, i, i + 1);

            // Choosing the maximum length
            int maxLen = Math.max(len1, len2);

            // If you find a palindrome longer than the previous one
            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2; // updating the start
                end = i + maxLen / 2; // updating the end
            }
        }
        // Returning the substring from start to end
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String a = "babad";

        System.out.println(longestPalindrome(a));
    }
}
