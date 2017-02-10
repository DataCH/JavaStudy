package com.code.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

	/**
	 * 核心线程数量，线程池维护线程的最少数量
	 */
	private static final int corePoolSize = 2;

	/**
	 * 线程池维护线程的最大数量
	 */
	private static final int maxPoolSize = 4;

	/**
	 * 线程池维护线程所允许的空闲时间
	 */
	private static final int keepAliveTime = 3;

	/**
	 * 线程池所使用的缓冲队列的大小
	 */
	private static final int workQueueSize = 3;

	/**
	 * 线程执行任务后sleep的时间，sleep是为了便于观察程序的运行结果
	 */
	private static final int produceTaskSleepTime = 2;

	/**
	 * 任务的最大数量
	 */
	private static final int produceTaskMaxNumber = 10;

	/**
	 * 任务名称的前缀
	 */
	private static final String taskNamePrefix = "task@";

	public static void main(String[] args) {

		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(corePoolSize,
				maxPoolSize, keepAliveTime, TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(workQueueSize),
				new ThreadPoolExecutor.DiscardOldestPolicy());

		for (int i = 0; i < produceTaskMaxNumber; i++) {
			String taskName = taskNamePrefix + (i + 1);
			System.out.println(String.format("put %s", taskName));

			System.out.println("--- before put " + taskName
					+ ", active thread count: " + threadPool.getActiveCount());
			ThreadPoolTask task = new ThreadPoolTask(taskName);
			threadPool.execute(task);
			System.out.println("--- after put " + taskName
					+ ", active thread count: " + threadPool.getActiveCount());

			try {
				Thread.sleep(produceTaskSleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
