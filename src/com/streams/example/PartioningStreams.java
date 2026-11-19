package com.streams.example;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartioningStreams {

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> m = l.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(m);
    }
}
