package com.kotlin.demo8

/*
    Kotlin 调用 Java方法抛出checked Exception 运行时异常
 */

fun main(args: Array<String>) {
    val myException = MyException()
    //myException.method() 无需try-catch处理，运行时抛出
    println("--------------")

    val clazz = MyException()::class.java //获取类的class
    println(clazz)
    println(MyException().javaClass)
}