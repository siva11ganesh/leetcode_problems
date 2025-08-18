package com.thread.problem;

public class ThreadCreationRunnable implements Runnable{

	String threadName;
	
	ThreadCreationRunnable(String name){
		this.threadName = name;
	}
	@Override
	public void run() {
		System.out.println("Test thread..."+threadName);
	}

	
	public static void main(String[] args) throws InterruptedException {
		ThreadCreationRunnable tt = new ThreadCreationRunnable("Thread-1");
		
		Thread t = new Thread(tt);
		System.out.println("Starting");
		t.start();
		t.join();
		System.out.println("Ending");
	}
}
