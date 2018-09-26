package com.kotlin.demo10;

import java.util.ArrayList;


/*
    Java 代码 调用 Kotlin扩展方法
 */
public class Test1 {
    public static void main(String[] args) {
        Demo1Kt.myMethod(new ArrayList<>());
        Demo1Kt.myMethod2(new ArrayList<>());
    }
}
