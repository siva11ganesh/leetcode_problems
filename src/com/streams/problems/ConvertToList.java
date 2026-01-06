package com.streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToList {

	public static void main(String[] args) {

		// Stream toList()
		Stream<String> stream = Stream.of("Apple", "Banana", "Orange");
		List<String> list = stream.toList();
		list.forEach(System.out::println);
		System.out.println("/*******************************************************************************/");

        // Stream concat
		List<String> list1 = Arrays.asList("apple", "banana", "orange");
		List<String> list2 = Arrays.asList("grape", "melon", "pineapple");

		Stream<String> stream1 = list1.stream();
		Stream<String> stream2 = list2.stream();

		Stream<String> concatenatedStream = Stream.concat(stream1, stream2);
		concatenatedStream.forEach(System.out::println);
		System.out.println("/*******************************************************************************/");

        // Stream iterate
		List<String> ll = Arrays.asList("AA", "BB", "CC");
		Stream<String> stream3 = ll.stream();
		stream3.iterator().forEachRemaining(System.out::println);
		System.out.println("/*******************************************************************************/");

        // Stream Generate - not stop generation process
		// Random random = new Random();
		// random.ints(10);
		// Stream<Integer> randomGen = Stream.generate(random::nextInt);
		// randomGen.forEach(System.out::println);

        // Stream pipline operations
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		double average = numbers.stream().filter(n -> n % 2 == 0) // Filter even numbers
				.mapToDouble(n -> n * 2.0) // Map to doubles and multiply by 2
				.average() // Calculate the average
				.orElse(0); // If no average, return 0

		System.out.println(average);
		System.out.println("/*******************************************************************************/");

        // Stream builder
		Stream.Builder<Integer> builder = Stream.builder();
		builder.add(1);
		builder.add(2);
		builder.add(3);
		Stream<Integer> streamBuilder = builder.build();
		streamBuilder.forEach(System.out::println);

		System.out.println("/*******************************************************************************/");

        // Stream grouping and aggregation
		List<String> names = Arrays.asList("John", "Alice", "Bob", "Jane", "");
		Map<Integer, Long> countByNameLength = names.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		countByNameLength.entrySet().forEach(System.out::println);
		System.out.println("/*******************************************************************************/");

        // Handle null values
		List<String> listNull = Arrays.asList("apple", null, "banana", null, "orange");
		listNull.stream().map(t -> {
			if (t == null) {
				return "NA";
			}
			return t.toUpperCase();
		}).toList();
		listNull.forEach(System.out::println);
		System.out.println("/*******************************************************************************/");

        List<String> listOptional = Arrays.asList("apple", null, "banana", null, "orange");
		List<Optional<String>> optionalList = listOptional.stream().map(Optional::ofNullable).toList();
		optionalList.forEach(System.out::println);

	}

}
