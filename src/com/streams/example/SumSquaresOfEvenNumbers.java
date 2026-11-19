package com.streams.example;

import java.util.List;

public class SumSquaresOfEvenNumbers {

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer m = l.stream()
                .filter(a -> a % 2 == 0)
                .map(a -> a * a)
                .reduce(Integer::sum).get();

        System.out.println(m);
    }
}
