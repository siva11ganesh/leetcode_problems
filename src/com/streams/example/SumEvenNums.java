package com.streams.example;

import java.util.List;

public class SumEvenNums {

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int m = l.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println(m);

    }
}
