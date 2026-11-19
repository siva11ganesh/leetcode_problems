package com.streams.example;

import java.util.List;

public class FindMaximum {

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 15, 6, 7, 8, 9, 10);

        int m = l.stream()
                .reduce(0, Integer::max);

        System.out.println(m);
    }
}
