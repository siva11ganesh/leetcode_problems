package com.methods.example;

public class Animal implements Moveable {

//	@Override
//	public void move() {
//		System.out.println("Override First Move");
//	}

	public static void main(String[] args) {
		Animal a = new Animal();
		Moveable.move2();
		a.move();
		int d = a.calc()+1;
		Moveable m = ()->5*2;
		int t = m.calc();
		System.out.println(t+"--"+d);
	}

	@Override
	public int calc() {
		return 0;
	}

	
}
