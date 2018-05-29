package com.daniel.hu.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel
 * @date 29/05/2018
 */
public class StringInternTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String i = "addd";

        while (true) {
            i = new StringBuilder(i).append(i).toString();
            list.add(String.valueOf(i).intern());
        }

    }

}
