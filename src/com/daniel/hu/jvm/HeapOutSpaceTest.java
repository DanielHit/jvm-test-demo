package com.daniel.hu.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel
 * @date 29/05/2018
 * String.intern() 不断增加常量区的内容. 导致最终溢出. Java8中已经移除了方法区. 和heap整合. 具体可以参考: http://www.importnew.com/14933.html
 * <p>
 * 运行结果:
 * objc[79545]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_66.jdk/Contents/Home/bin/java (0x1097e84c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_66.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x1098744e0). One of the two will be used. Which one is undefined.
 * <p>
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 * at java.util.Arrays.copyOfRange(Arrays.java:3664)
 * at java.lang.String.<init>(String.java:207)
 * at java.lang.StringBuilder.toString(StringBuilder.java:407)
 * at com.daniel.hu.jvm.StringInternTest.main(StringInternTest.java:22)
 */
public class HeapOutSpaceTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String i = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        while (true) {
            i = new StringBuilder(i).append(i).toString();
            list.add(String.valueOf(i).intern());
        }

    }

}
