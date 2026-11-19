package com.streams.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindMinAndMax {

	public static void main(String[] args) {

		int[] arr = { 40, 3, 1, 83, 92, 26 };

		IntStream a = Arrays.stream(arr); // This will perform one operation only

		// System.out.println(a.min().getAsInt());

		List<Integer> list = new ArrayList<>();

		for (int a1 : arr) {
			list.add(a1);
		}

		Optional<Integer> max = list.stream().sorted().max(Comparator.comparingInt(Number::intValue));
		System.out.println(max.get());

		Optional<Integer> min = list.stream().sorted().min(Comparator.comparingInt(Number::intValue));
		System.out.println(min.get());

		Optional<Integer> maxWithoutSort = list.stream().max(Comparator.comparingInt(Number::intValue));
		System.out.println(maxWithoutSort.get());

		List<Integer> boxed = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(boxed);
	}

}
