package com.kotlin.demo9;

public class Test1 {
    public static void main(String[] args) {
        //在Java代码中，无法使用new关键字来创建Kotlin编译器自动生成的以Kt结尾的类的实例.
        //原因则是在编译完的字节码中没有提供这个类的构造方法.
        //Demo2Kt demo2Kt = new Demo2Kt();

        classA a = new classA();

        Demo2Kt.setStr("123");
        System.out.println(Demo2Kt.getStr());

        Demo2Kt.method();
    }
}
