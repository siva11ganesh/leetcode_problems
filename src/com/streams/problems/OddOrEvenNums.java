package com.streams.problems;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Author: Sivaganesh S
 * Date:9/23/2025
 */

public class OddOrEvenNums {

    public static void main(String[] args) {

        //EVEN
        IntStream.range(1, 10)
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);

        System.out.println("**************************************");
        //ODD
        IntStream.range(1, 10)
                .filter(value -> value % 2 != 0)
                .forEach(System.out::println);

        System.out.println("**************************************");
        IntStream.of(1, 3, 5, 7, 9)
                .map(value -> value * 2)
                .forEach(System.out::println);

        System.out.println("**************************************");
        IntStream.of(1, 2, 4, 56, 6)
                .boxed()
                .toList().forEach(System.out::println);

        System.out.println("***********************************************");
        List<Integer> list = List.of(1, 5, 2, 4, 6);

        list.stream().map(value -> value * value)
                .sorted(Comparator.reverseOrder())
                .toList().forEach(System.out::println);

        System.out.println("***********************************************");

        List<Integer> list1 = List.of(1, 5, 2, 4, 6, 2, 4, 7, 10);

        Map<Integer, Long> countList = list1.stream().
                collect(Collectors.groupingBy(integer -> integer,
                        Collectors.counting()));

        countList.entrySet().forEach(System.out::println);
    }
}
