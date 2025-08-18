package com.methods.example;

@FunctionalInterface
public interface Moveable {

	default void move() {
		System.out.println("First move..");
	}

	static void move2() {
		System.out.println("Second Move");
	}

	abstract int calc();

}
