package com.streams.example;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AvgOfNumbers {

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        OptionalDouble m = l.stream().mapToInt(Integer::intValue).average();

        System.out.println(m);
    }
}
