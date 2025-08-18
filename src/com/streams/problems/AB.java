package com.streams.problems;

public sealed interface AB permits Java17Test, Java17_2 {

	void display();

	default void process(String msg) {
		System.out.println("Default..!" + msg);
	}

	static void process2(String a) {
		System.out.println("Static..!" + a);
	}
	
	abstract void test();
}
