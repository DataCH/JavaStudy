package com.code.threadpool;

import java.io.Serializable;

public class ThreadPoolTask implements Runnable, Serializable {

	private static final long serialVersionUID = 1L;

	private Object threadPoolTaskData;

	ThreadPoolTask(Object tasks) {
		this.threadPoolTaskData = tasks;
	}

	public void run() {
		System.out.println("start ..." + threadPoolTaskData);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end ..." + threadPoolTaskData);
		threadPoolTaskData = null;
	}

}
