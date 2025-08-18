package com.abstraction;

public class Child extends Parent {

	protected void test(double a) {
		System.out.println("Double:" + a);
	}

	@Override
	void test2() {
		System.out.println("1221");
	}
}
