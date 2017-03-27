package com.code.concurrency.threadbasic.create;

public class FirstRunnable implements Runnable {

    @Override
    public void run() {
        //定义任务
        System.out.println(Thread.currentThread().getName() + ": Hello, this is FirstRunnable!");
    }

}
