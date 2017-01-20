package com.code.concurrency;

public class FirstRunnable implements Runnable {

	@Override
	public void run() {
		//定义任务
		System.out.println("Hello, this is FirstRunnable!");
	}

}
