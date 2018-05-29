package com.daniel.hu.jvm;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author Daniel
 * @date 29/05/2018
 * <p>
 * Unsafe直接操作本地内存.
 */
public class DirectOomTest {
    private static final int block = 1000 * 1024 * 1024;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);

        int i = 0;
        while (true) {
            unsafe.allocateMemory(block);
            i++;
            System.out.println(i);
        }
    }
}
