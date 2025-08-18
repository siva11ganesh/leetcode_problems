package com.streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8StreamsTest {

	public static Map<String, SalaryStats> computeSalaryStats(List<Employee> employees) {
		return employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.collectingAndThen(Collectors.summarizingDouble(Employee::getSalary),
								stats -> new SalaryStats(stats.getAverage(), stats.getMin(), stats.getMax()))));
	}

	public static void main(String[] args) {
		List<Employee> employees = List.of(new Employee("Siva", 678901.00, "Tech"),
				new Employee("SSG", 678901.00, "Tech"), new Employee("SG", 40000.00, "IT"),
				new Employee("Gane", 678901.00, "FIN"), new Employee("Arav", 525252.00, "IT"),
				new Employee("Arun", 678901.00, "FIN"));

		Map<String, SalaryStats> mapData = computeSalaryStats(employees);

		mapData.entrySet().stream().forEach(System.out::println);

		computeSalary(employees);

		List<String> words = Arrays.asList("apple", "bat", "banana", "cat", "ant", "apple", "apple", "bat");
		findOccurence(words);

		findTotalLength(words);

		String name = "Sivaganesh";
		subStringName(name);

		findEachWordsLength(words);
		
		StringPlays(name);
	}

	public static void computeSalary(List<Employee> employees) {
		employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)))
				.entrySet().stream().forEach(System.out::println);
	}

	public static void findOccurence(List<String> words) {
		words.stream().collect(Collectors.groupingBy(t -> t, Collectors.counting())).entrySet().stream()
				.filter(t -> t.getValue() > 1).forEach(t -> System.out.println(t.getKey() + "," + t.getValue()));
	}

	public static void findTotalLength(List<String> words) {
		int a = words.stream().distinct().collect(Collectors.summingInt(CharSequence::length)).intValue();
		System.out.println(a);
	}

	public static void findEachWordsLength(List<String> list) {
		list.stream().map(t -> t.length()).forEach(System.out::println);

		list.stream().distinct().collect(Collectors.groupingBy(t -> t, Collectors.summingInt(value -> value.length())))
				.entrySet().stream().forEach(t -> System.out.println(t.getKey() + "," + t.getValue()));
	}

	public static void subStringName(String name) {
		IntStream.range(0, name.length() - 1).mapToObj(i -> name.subSequence(i, i + 2)).forEach(System.out::println);

		IntStream.range(0, name.length() - 2).mapToObj(i -> name.subSequence(i, i + 3)).forEach(System.out::println);

		IntStream.range(0, name.length() - 3).mapToObj(i -> name.subSequence(i, i + 4)).forEach(System.out::println);
	}

	public static void StringPlays(String name) {
		int a = name.compareTo("SivaGanesh");
		
		System.out.println(a+"..ComapreTo");
		
		System.out.println("...Codepoint:" + name.codePointAt(0));
		System.out.println("...codePointBefore:" + name.codePointBefore(2));
		System.out.println("...codePointCount:" + name.codePointCount(2, 5));
		System.out.println("...codePoints:" + name.codePoints().summaryStatistics().toString());
	}
}
