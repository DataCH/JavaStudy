package com.code.concurrency.synchronize;

public class SequenceTest {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread td = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(UnsafeSequence.getSequence());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            td.start();
        }
    }

}
