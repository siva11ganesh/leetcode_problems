package com.streams.problems;

import java.util.stream.IntStream;

/**
 * Author: Sivaganesh S
 * Date:9/23/2025
 */

public class Boa {

    public static void main(String[] args) {
        //print 1 to 10
        //filter divisible by 3
        //square the filtered values

        IntStream.range(1, 10)
                .filter(value -> value % 3 == 0)
                .map(filteredValue -> filteredValue * filteredValue)
                .forEach(System.out::println);

        //print 1 to 10
        //filter divisible by 2
        //square the filtered values
        IntStream.range(1, 10)
                .filter(value -> value % 2 == 0)
                .map(filteredValue -> filteredValue * filteredValue)
                .forEach(System.out::println);
    }

}
