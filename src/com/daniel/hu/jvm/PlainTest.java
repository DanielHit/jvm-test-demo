package com.daniel.hu.jvm;

/**
 * @author Daniel
 * @date 05/06/2018
 */
public class PlainTest {

    static {
        System.out.println("plain class ");
    }

    public static void main(String[] args) {
        // 只初始化了 super class
        System.out.println(ChildClass.a);
    }
}
