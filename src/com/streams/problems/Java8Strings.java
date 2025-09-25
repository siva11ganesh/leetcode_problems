package com.streams.problems;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Strings {
	
	public static void main(String[] args) {
		
		String a = "abcdefgh";

		List<String> b = getBigrams(a);
		System.out.println(b);
	}

	public static List<String> getBigrams(String input) {
		if (input == null || input.length() < 2) return Collections.emptyList();

		return IntStream.range(0, input.length() - 1)
				.mapToObj(i -> input.substring(i, i + 2))
				.collect(Collectors.toList());
	}

}
