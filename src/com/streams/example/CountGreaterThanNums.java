package com.streams.example;

import java.util.List;

public class CountGreaterThanNums {

    public static void main(String[] args) {
        List<Integer> l = List.of(2, 6, 8, 10, 1, 3);

      long m =  l.stream()
                .filter(a-> a>5)
                .count();

        System.out.println(m);
    }
}
