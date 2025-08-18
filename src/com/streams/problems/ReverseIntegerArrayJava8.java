package com.streams.problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArrayJava8 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 2, 7, 9 };

		// ReverseInteger
		int[] b = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
		System.out.println(Arrays.toString(b));

		// Last Element of Array
		System.out.println(IntStream.rangeClosed(1, arr.length).skip(arr.length - 1).findFirst().getAsInt());
	}
}
