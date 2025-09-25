package com.streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CommonStreams {

	public static void main(String[] args) {
		// Print Given Range
		IntStream.range(1, 11).forEach(System.out::println);

		System.out.println("*****************");

		// Sum
		int sum = IntStream.range(1, 11).sum();
		System.out.println(sum);

		System.out.println("*****************");
		// Reverse Integer
		int[] array = new int[] { 5, 1, 7, 3, 9, 6 };
		int[] reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
		System.out.println(Arrays.toString(reversedArray));

		System.out.println("*****************");
		// Print even Nums
		IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
		System.out.println("*****************");

		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
				"Pencil");
		Map<String, Long> elementCountMap = listOfStrings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue())
				.get();
		System.out.println("Most Frequent Element : " + mostFrequentElement.getKey());
		System.out.println("Count : " + mostFrequentElement.getValue());

		System.out.println("*****************");

		Stream.iterate(new int[] { 1, 3 }, f -> new int[] { f[1], f[1] + 2 }).limit(10).map(f -> f[0])
				.forEach(System.out::println);
		System.out.println("*****************");
	}
}
