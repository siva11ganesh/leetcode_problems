package com.blind75.slidingwindow;

import java.util.Arrays;

//Smallest window containing 0, 1 and 2
public class SubStrings {

    static int smallestSubstring(String S)
    {
        int n = S.length(), i = 0, k = 0, cnt = 0,
                min_len = Integer.MAX_VALUE;
        int[] freq = new int[3];
        Arrays.fill(freq, 0);
        while (k < n) {
            int i1 = freq[S.charAt(k) - '0'];
            i1++;
            if (i1 == 1)
                cnt++;
            if (cnt == 3) {
                while (freq[S.charAt(i) - '0'] > 1) {
                    freq[S.charAt(i) - '0']--;
                    i++;
                }
                min_len = Math.min(min_len, k - i + 1);
                freq[S.charAt(i) - '0']--;
                i++;
                cnt--;
            }
            k++;
        }
        return (min_len == Integer.MAX_VALUE) ? -1
                : min_len;
    }

    public static void main(String[] args) {
        String S = "01212";
        System.out.println(smallestSubstring(S));
    }
}
