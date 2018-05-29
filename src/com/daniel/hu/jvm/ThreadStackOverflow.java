package com.daniel.hu.jvm;

/**
 * @author Daniel
 * @date 29/05/2018
 * 栈溢出
 */
public class ThreadStackOverflow {
    public static void main(String[] args) {
        ThreadStackOverflow threadStackOverflow = new ThreadStackOverflow();
        threadStackOverflow.stackLeakByThread();
    }

    private void work() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        int num = 0;
        while (true) {
            new Thread(() -> work()).start();
            System.out.println(num++);
        }
    }

}
