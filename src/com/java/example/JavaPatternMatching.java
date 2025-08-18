package com.java.example;

public class JavaPatternMatching {

	public static void main(String[] args) {
		Object obj = "Siva";
		switchWithPatternMatching(obj);
	}

	public static void switchWithPatternMatching(Object obj) {
		switch (obj) {
		case Integer integer -> {
			System.out.println("Received an Integer: " + integer);
		}
		case String text -> {
			System.out.println("Received a String: " + text);
		}
		default -> {
			System.out.println("Received an unknown object");
		}
		}
	}
}
