package com.streams.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

    public static void main(String[] args) {

        //1
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

        //2
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5);

        //3
        String[] arr = {"a", "b", "c"};
        Stream<String> s2 = Arrays.stream(arr);

        //4
        Stream<Double> s3 = Stream.generate(Math::random).limit(5);
    }
}
