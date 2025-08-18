package com.pattern.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton.getInstance().doSomething();
		
		Singleton.getThreadInstance().doSomething();
		
		ThreadSafeSingleton2.getInstance().doSomething();;
	}
}
