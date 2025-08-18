package com.pattern.singleton;

public class Singleton {

	// Lazy initialization and not a thread-safe

	private static Singleton instance;

	private Singleton() {
		System.out.println("Singleton instantiated");
	}

	//without checking null -  Eager initialization
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void doSomething() {
		System.out.println("I'm Singleton");
	}

	public static synchronized Singleton getThreadInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
