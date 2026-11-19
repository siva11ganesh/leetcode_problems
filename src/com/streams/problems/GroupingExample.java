package com.streams.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingExample {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 4, 6, 8, 9, 8, 2, 2, 5, 2, 7, 2, 9);

		Map<Integer, Long> a = nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(a);

		List<String> letters = Arrays.asList("A", "A", "a", "c", "C", "D", "F");

		Map<String, Long> b = letters.stream().map(String::toUpperCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(b);

		List<List<Integer>> numsList = Arrays.asList(Arrays.asList(1, 2, 5, 8, 9), Arrays.asList(1, 2, 4, 6, 7));

		List<Integer> numsListFlatten = numsList.stream().flatMap(Collection::stream).toList();

		System.out.println(numsListFlatten.stream().distinct().sorted().collect(Collectors.toList()));

		List<Integer> olist = List.of(1, 3, 5, 1, 8, 7, 2, 4, 8);

		Map<Integer, Long> a1 = olist.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		List<Entry<Integer, Long>> a2 =  a1.entrySet().stream().filter(t -> t.getValue()>=2).collect(Collectors.toList());
		System.out.println(a2);

	}

}
