package com.code.concurrency;

public class AnotherThread extends Thread {

	public void run() {
		System.out.println("Hello, this is AnotherThread.");
	}

	public static void main(String[] args) {
		Thread t = new AnotherThread();
		t.start();
	}

}
