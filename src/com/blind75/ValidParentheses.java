package com.blind75;

import java.util.Stack;

public class ValidParentheses {

    private static boolean isValid(String s) {
        Stack<Character> value = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                value.push(')');
            } else if (c == '{') {
                value.push('}');
            } else if (c == '[') {
                value.push(']');
            } else if (value.isEmpty() || value.pop() != c) {
                return false;
            }
        }
        return value.isEmpty();
    }

    public static void main(String[] args) {

        String s = "({[]})";
        boolean isValid = isValid(s);

        System.out.println(isValid);
    }
}
