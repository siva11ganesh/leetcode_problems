package com.streams.example;

import java.util.List;

public class SquareEvenOrOddNumbers {

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       l.stream().filter(value -> value % 2 == 0)
                .map(filteredValue -> filteredValue * filteredValue)
                .forEach(System.out::println);

//        l.stream().filter(value -> value % 2 != 0)
//                .map(filteredValue -> filteredValue * filteredValue)
//                .forEach(System.out::println);
    }
}
