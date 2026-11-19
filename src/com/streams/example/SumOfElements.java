package com.streams.example;

import java.util.List;

public class SumOfElements {

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = l.stream().reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
