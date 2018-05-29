package com.daniel.hu.jvm;

/**
 * @author Daniel
 * @date 29/05/2018
 * <p>
 * 返回结果: true false
 * <p>
 * <p>
 * 解释:
 * <p>
 * str1="xx" 形式, 直接str1在常量池
 * <p>
 * str1.intern也是从常量池获取的. 是一个对象. 所以第一个true
 * <p>
 * str2 = new StringBuilder() 是从heap中创建一个对象.
 * str2.intern 从堆中看是否有. 如果有从常量池中获取.
 * <p>
 * StringBuilder的 toString方法"        return new String(value, 0, count);"
 * <p>
 * 学习文章: https://tech.meituan.com/in_depth_understanding_string_intern.html
 */

public class StringInternTest {

    public static void main(String[] args) {

        String str1 = "hello";
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("jap").toString();

        // false
        System.out.println(str2.intern() == str2);

        // true
        System.out.println(str2.intern() == "jap");

        //false
        System.out.println(str2 == "jap");
    }
}
