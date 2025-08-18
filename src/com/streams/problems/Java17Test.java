package com.streams.problems;

public non-sealed class Java17Test implements AB {

	public static void main(String[] args) {
		A a = new A("Siva", 28);
		System.out.println(a.name());

		Java17Test jj = new Java17Test();
		jj.display();
		jj.process("Java17");
		AB.process2("Java17");
		jj.test();

		Java17_2 jk = new Java17_2();
		jk.display();
		jk.process("Java17_2");
		AB.process2("Java17_2");
		jk.test();

	}

	@Override
	public void display() {
		System.out.println("17Test");
	}

	@Override
	public void test() {
		System.out.println("Abs--Java17");
	}

}

record A(String name, int age) {
}