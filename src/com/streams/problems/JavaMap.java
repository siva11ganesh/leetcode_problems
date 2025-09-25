package com.streams.problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Author: Sivaganesh S
 * Date:9/25/2025
 */

public class JavaMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Siva");
        map.put(2, "Palani");
        map.put(3, "Ganesh");
        map.put(4, "Raj");
        map.put(7, "Aravind");
        map.put(5, "Vignesh");

        Map<Integer, JavaRecord> linkedMap;

        List<JavaRecord> recordList = List.of(
                new JavaRecord(1, "Siva"),
                new JavaRecord(2, "Ganesh"),
                new JavaRecord(3, "Palani"),
                new JavaRecord(5, "Aravind"),
                new JavaRecord(4, "Vignesh")
        );

        linkedMap = recordList.stream()
                .collect(Collectors.toMap(JavaRecord::id, Function.identity()));

        linkedMap.entrySet().forEach(System.out::println);

//        map.entrySet().forEach(System.out::println);
    }

}

record JavaRecord(int id, String name) {
}

