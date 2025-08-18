package com.streams.problems;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);

		IntSummaryStatistics avg = nums.stream().collect(Collectors.summarizingInt(Number::intValue));

//		IntSummaryStatistics it provides the count,sum, min,avg,max

		System.out.println(avg.getSum());
		System.out.println(avg.getCount());
		System.out.println(avg.getMin());
		System.out.println(avg.getMax());
		System.out.println(avg.getAverage());
		System.out.println(avg);
	}

}
