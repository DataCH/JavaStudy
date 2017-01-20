package com.code.concurrency;

public class FirstThread {

	public static void main(String[] args) {
		// Runnable对象本身不具备任何内在的线程能力，必须将它提交给一个Thread构造器，才能将Runnable对象转变为工作任务
		Thread t = new Thread(new FirstRunnable());
		// 调用Thread对象的start()方法为该线程执行必需的初始化操作，然后调用Runnable的run方法，启动工作任务
		t.start();
	}

}
