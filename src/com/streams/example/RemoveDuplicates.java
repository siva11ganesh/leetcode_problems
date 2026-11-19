package com.streams.example;

import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 3, 2, 1, 4, 4, 7, 9, 2);

        l.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
