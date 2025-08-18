package com.thread.problem;

public class ThreadCreationExtend extends Thread{

	public void run() {
		System.out.println("Test Thread...");
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadCreationExtend t = new ThreadCreationExtend();
		System.out.println("Starting");
		t.start();
		t.join();
		System.out.println("Ending");
	}
}
