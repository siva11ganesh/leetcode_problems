package com.streams.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {

    public static void main(String[] args) {
        List<String> s = Arrays.asList("Apple", "Avacado", "Banana", "Orange");

       String a =  String.join("||", s);

        System.out.println(a);
    }
}
