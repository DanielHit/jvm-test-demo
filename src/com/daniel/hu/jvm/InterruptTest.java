package com.daniel.hu.jvm;

import java.util.concurrent.TimeUnit;

/**
 * @author Daniel
 * @date 04/06/2018
 */
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(10 * 1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("interrupt");
                }
            }
        });

        thread.start();

        TimeUnit.SECONDS.sleep(2);

        thread.interrupt();

        System.out.println(thread.isInterrupted());

    }
}
