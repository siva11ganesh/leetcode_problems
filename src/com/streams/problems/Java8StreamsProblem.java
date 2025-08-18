package com.streams.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8StreamsProblem {

	public static void main(String[] args) {

		// Filter and Collect Names
		List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "adam", "Eve");

		names.stream().filter(t -> !t.toUpperCase().startsWith("A")).forEach(System.out::println);

		// Square and Filter Even Numbers

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		numbers.stream().map(t -> t.intValue() * t.intValue()).filter(t -> t.intValue() % 2 == 0)
				.forEach(System.out::println);

		// Grouping by String Length
		List<String> words = Arrays.asList("apple", "bat", "banana", "cat", "ant");

		words.stream().collect(Collectors.groupingBy(t -> t.length())).entrySet().forEach(System.out::println);

		// Find First Non-Repeating Character
		String input = "swiss";

		Map<Character, Long> frequencyMap = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Optional<Character> result = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey).findFirst();

		System.out.println(result.get());

		// Custom Object Filtering and Sorting
		List<Employee> employees = Arrays.asList(new Employee("John", 60000), new Employee("Jane", 40000),
				new Employee("Doe", 55000));

		employees = employees.stream().sorted(Comparator.comparing(Employee::getName))
				.filter(t -> t.getSalary() > 50000).toList();

		for (Employee e : employees) {
			System.out.println(e.name + "..." + e.salary);
		}

		String[] ana = { "bat", "tab", "cat", "act", "tac", "dog" };
		List<List<String>> li = groupAnagrams(Arrays.asList(ana));
		System.out.println(li.toString());

	}

	public static List<List<String>> groupAnagrams(List<String> words) {
		return new ArrayList<>(words.stream()
				.collect(Collectors.groupingBy(word -> word.chars().sorted()
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()))
				.values());
	}
}
