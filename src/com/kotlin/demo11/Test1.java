package com.kotlin.demo11;

import java.io.FileNotFoundException;

/*
    Java调用Kotlin方法，Kotlin方法会抛出异常
 */
public class Test1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        try {
            demo1.method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
