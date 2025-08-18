package com.streams.problems;

public final class Java17_2 implements AB {

	@Override
	public void display() {
		System.out.println("17_2");
	}

	@Override
	public void test() {
		System.out.println("Abstract_17Java_2");
	}

	public static void main(String[] args) {
		Object a = "test";

		switch (a) {
		case String text: {
			System.out.println("Text...");
		}
			break;
		case Integer integer: {
			System.out.println("Integer...");
		}
			break;
		default:
			System.out.println("Default");
			break;

		}
	}

}
