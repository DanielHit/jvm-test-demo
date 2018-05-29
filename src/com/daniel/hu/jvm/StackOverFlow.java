package com.daniel.hu.jvm;

/**
 * @author Daniel
 * @date 29/05/2018
 */
public class StackOverFlow {

    static long number = 0;


    public static void main(String[] args) {
        try {
            newStack();
        } catch (Exception e) {
            System.out.println(number);
        }
    }

    public static void newStack() {
        number++;
        System.out.println(number);
        newStack();
    }
}
