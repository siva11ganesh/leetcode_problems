package com.streams.problems;

import java.util.List;
import java.util.stream.Stream;

public class MergeArrays {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 3, 5, 7);
        List<Integer> list2 = List.of(2, 4, 6, 8);

        List<Integer> merged = Stream.of(list, list2)
                .flatMap(List::stream)
                .sorted()
                .toList();

        System.out.println(merged);

    }
}
