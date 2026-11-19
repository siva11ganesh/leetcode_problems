package com.streams.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurrences {

    public static void main(String[] args) {
        List<String> s = Arrays.asList("Apple", "Avacado", "Banana", "Orange", "bat", "is");


        s.stream()
                .collect(Collectors.groupingBy(String::length))
                .forEach((integer, strings) -> {
                    System.out.println(integer + "--" + strings);
                });
    }
}
