package com.thread.problem;

public class ThreadProblem2 {
	// Same Thread Problem implementation but used Runnable

	private static final int LIMIT = 10;
	private static int number = 1;
	private static final Object lock = new Object();

	public static void main(String[] args) throws InterruptedException {

		Runnable oddTask = () -> {
			while (number <= LIMIT) {
				synchronized (lock) {
					if (number % 2 != 0) {
						System.out.println("Odd: " + number);
						number++;
						lock.notify();
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}
				}
			}
		};

		Runnable evenTask = () -> {
			while (number <= LIMIT) {
				synchronized (lock) {
					if (number % 2 == 0) {
						System.out.println("Even: " + number);
						number++;
						lock.notify();
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}
				}
			}
		};

		Thread oddThread = new Thread(oddTask);
		Thread evenThread = new Thread(evenTask);

		oddThread.start();
		evenThread.start();

	}

}
