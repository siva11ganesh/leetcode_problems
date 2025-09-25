package com.streams.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Sivaganesh S
 * Date:9/25/2025
 */

public class Pangram {

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over a lazy dog";

        String a = "hello";

        System.out.println(isPangram(s.toLowerCase()));
        System.out.println(isPangram(a.toLowerCase()));

    }

    static boolean isPangram(String s) {
        Set<Character> characters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                characters.add(c);
            }
        }
        return characters.size() == 26;
    }
}
