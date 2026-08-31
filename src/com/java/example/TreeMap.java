package com.java.example;

import java.util.Map;

public class TreeMap {


    public static void main(String[] args) {
        Map<Integer, String> treeMap = new java.util.TreeMap<>();

        treeMap.putIfAbsent(10, "C");
        treeMap.put(5, "B");
        treeMap.putIfAbsent(8, "A");

        treeMap.forEach((integer, s) -> System.out.println(integer + "-- value:" + s));

    }
}
