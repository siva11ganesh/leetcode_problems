package com.blind75.TwoPointers;

/**
 * Two pointers, String
 */
public class ValidPalindrome {

    public static boolean check(String st, int i, int n) {
        if (i >= n / 2) return true;
        if (st.charAt(i) != st.charAt(n - i - 1)) return false;

        return check(st, i + 1, n);
    }

    public static boolean isPalindrome(String st) {
        st = st.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = st.length();
        return check(st, 0, n);
    }

    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";

        String b = "race a car";
        System.out.println("A:" + isPalindrome(a));
        System.out.println("B:" + isPalindrome(b));
    }
}
