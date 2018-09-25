package com.kotlin.demo9;

/*
    java 代码访问 伴生对象
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(People.Companion.getA());
        //System.out.println(People.a); 如果属性被@JvmField修饰
    }
}
