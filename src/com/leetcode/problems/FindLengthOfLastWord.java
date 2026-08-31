package com.leetcode.problems;

public class FindLengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        int n = s.length() - 1;
        while (n >= 0 && s.charAt(n) == ' ') n--;
        int k = 0;
        while (n >= 0 && s.charAt(n) != ' ') {
            k++;
            n--;
        }
        return k;
    }


    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";


        System.out.println(FindLengthOfLastWord.lengthOfLastWord(s));

    }
}
