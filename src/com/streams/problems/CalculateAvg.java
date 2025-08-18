package com.streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateAvg {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);

		Double avg = nums.stream().collect(Collectors.averagingInt(Number::intValue));

		System.out.println(avg);
		
//		double temp = 0;
//		int count = 0;
//		for(int n: nums) {
//			 temp = temp + n;
//			 count++;
//		}
//		
//		System.out.println(temp+"---"+count);
//		double d = temp/count;
//		
//		System.out.println(d);
	}
}
