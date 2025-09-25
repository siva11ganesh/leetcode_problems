package com.streams.problems;

/**
 * Author: Sivaganesh S
 * Date:9/25/2025
 */

public class Anagram {

    public static void main(String[] args) {
        String s1 = "keep";
        String s2 = "peek";

        System.out.println(isAnagram(s1, s2));
    }

    static boolean isAnagram(String s1, String s2) {

        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        // Sort using streams and compare
        String sortedStr1 = s1.chars()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        String sortedStr2 = s2.chars()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        return sortedStr1.equals(sortedStr2);
    }
}
