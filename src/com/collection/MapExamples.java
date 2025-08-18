package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<>();
		m1.put("A", "1");
		m1.put("B", "2");
		m1.put("C", "3");
		m1.put("D", "0");

		//m1.entrySet().forEach(System.out::println);

		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "A");
		linkedHashMap.put(4, "D");
		linkedHashMap.put(2, "B");
		linkedHashMap.put(3, "C");

		//linkedHashMap.entrySet().forEach(System.out::println);

		int[] a = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };

		Map<Integer, Integer> count = new HashMap<>();

		for (int a1 : a) {
			if (!count.isEmpty() && count.containsKey(a1)) {
				count.put(a1, count.getOrDefault(a1, 0) + 1);
			} else {
				count.put(a1, 1);
			}
		}

		count.entrySet().forEach(System.out::println);
	}
}
