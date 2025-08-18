package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	// Thread-Safe Alternatives: For thread-safe operations, use
	// ConcurrentSkipListSet or wrap a set using Collections.synchronizedSet().

	// Maintains order
	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<Integer>();

		s1.add(1);
		s1.add(3);
		s1.add(2);
		s1.add(3);
		s1.add(6);

		s1.stream().forEach(System.out::println);

	}
}
