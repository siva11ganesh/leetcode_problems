package com.thread.problem;

public class ThreadProblem {

	// create a two thread - 1 thread will print odd numbers and another will print
	// even numbers
	private static final Object lock = new Object();
	private static boolean isOdd = true;

	public static void main(String[] args) {

		Thread oddThread = new Thread(() -> {
			for (int i = 1; i <= 10; i += 2) {
				synchronized (lock) {
					while (!isOdd) {
						try {
							lock.wait();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					System.out.println("Thread odd Num:-->" + i);
					isOdd = false;
					lock.notify();
				}
			}
		});

		Thread evenThread = new Thread(() -> {
			for (int i = 2; i <= 10; i += 2) {
				synchronized (lock) {
					while (isOdd) {
						try {
							lock.wait();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					System.out.println("Thread Even Num:-->" + i);
					isOdd = true;
					lock.notify();
				}
			}
		});

		oddThread.start();
		evenThread.start();
	}

}
