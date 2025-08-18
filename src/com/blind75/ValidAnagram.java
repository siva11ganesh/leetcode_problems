package com.blind75;

import java.util.HashMap;

public class ValidAnagram {

    private static boolean isValidAnagram(String a, String b) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int matched = 0;
        for (char ch : a.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : b.toCharArray()) {
            if (!hashMap.containsKey(ch)) {
                return false;
            }
            hashMap.put(ch, hashMap.get(ch) - 1);
            if (hashMap.get(ch) < 0) {
                return false;
            } else if (hashMap.get(ch) == 0) {
                matched += 1;
            }
        }
        return matched == hashMap.size();
    }

    public static void main(String[] args) {
        String a = "anagram";
        String b = "nagaram";
        System.out.println(isValidAnagram(a, b));
    }
}
