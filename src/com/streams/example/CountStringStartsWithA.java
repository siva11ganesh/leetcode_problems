package com.streams.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CountStringStartsWithA {

    public static void main(String[] args) {
        List<String> s = Arrays.asList("Apple", "Avacado", "Banana", "Orange");


        long m = s.stream()
                .filter(a -> a.startsWith("A"))
                .count();

        System.out.println(m);
    }
}
