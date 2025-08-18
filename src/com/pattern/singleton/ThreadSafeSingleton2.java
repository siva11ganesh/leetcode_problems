package com.pattern.singleton;

public class ThreadSafeSingleton2 {
	private static volatile ThreadSafeSingleton2 obj = null;

	private ThreadSafeSingleton2() {
	}

	public static ThreadSafeSingleton2 getInstance() {
		if (obj == null) {
			// To make thread safe
			synchronized (ThreadSafeSingleton2.class) {
				// check again as multiple threads
				// can reach above step
				if (obj == null)
					obj = new ThreadSafeSingleton2();
			}
		}
		return obj;
	}

	public void doSomething() {
		System.out.println("Thread Safe..");
	}
}
