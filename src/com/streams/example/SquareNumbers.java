package com.streams.example;

import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        l.stream().map(a -> a * a).forEach(System.out::println);
    }
}
