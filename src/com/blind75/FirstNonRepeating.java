package com.blind75;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static Character firstNonRepeating(String input) {

        Map<Character, Integer> frequency =
                new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            frequency.merge(ch, 1, Integer::sum);
        }

        return frequency.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        String a = "swiss";
        System.out.println(firstNonRepeating(a));
    }
}
