package com.streams.example;

import java.util.List;

public class RemoveOddElements {

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        l.stream().filter(a -> a % 2 == 0).forEach(System.out::println);
    }
}
