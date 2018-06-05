package com.daniel.hu.jvm;

/**
 * @author Daniel
 * @date 04/06/2018
 */
public class ClassAnalysisTest {

    public int inc() {
        int x;

        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }

    }

    public void sodSycn() {
        synchronized (this) {
            System.out.println("hello world!");
        }
    }

    public synchronized void fuck() {
        System.out.println("fuck");
    }


}
