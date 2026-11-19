package com.streams.example;

import java.util.Comparator;
import java.util.List;

public class SortNumbers {

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        l.stream()
//                .sorted()
//                .forEach(System.out::println);

        l.stream().
                sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
