package com.streams.example;

import java.util.Arrays;
import java.util.List;

public class FindFirstNumber {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(3, 7, 11, 12, 5, 20);

        int m = l.stream()
                .filter(a -> a > 10)
                .sorted()// sorted way
                .findFirst().get();

        System.out.println(m);
    }
}
