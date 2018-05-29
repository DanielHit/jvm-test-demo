package com.daniel.hu.jvm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Daniel
 * @date 29/05/2018
 */
public class MyClassLoader extends ClassLoader {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        MyClassLoader myClassLoader = new MyClassLoader();
        Class myClass = myClassLoader.findClass("/Users/Daniel/work_project/github/Jvm-Test-Demo/out/production/jvm-test-demo/com/daniel/hu/jvm/StackOverFlow.class");
        myClass.newInstance();

    }

    @Override
    public Class findClass(String name) {
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String name) {
        FileInputStream fileInputStream = null;
        try {
            File file = new File(name);
            byte[] bytes = new byte[Math.toIntExact(file.length())];
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytes);
            return bytes;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
