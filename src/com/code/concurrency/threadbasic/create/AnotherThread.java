package com.code.concurrency.threadbasic.create;

public class AnotherThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Hello, this is AnotherThread.");
    }

    public static void main(String[] args) {
        Thread t = new AnotherThread();
        t.start();
        System.out.println(Thread.currentThread().getName() + ": end");
    }

}
