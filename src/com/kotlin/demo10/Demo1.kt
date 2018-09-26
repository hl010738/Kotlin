package com.kotlin.demo10


/*
    扩展方法 类型擦除
 */

fun List<String>.myMethod(): List<String>{
    return listOf("1")
}

@JvmName("myMethod2") //没有这个注解将会编译出错
fun List<Int>.myMethod(): List<Int>{
    return listOf(1)
}

fun main(args: Array<String>) {
    var l1 = listOf("1")
    println(l1.myMethod())

    var l2 = listOf(1)
    println(l2.myMethod())
}