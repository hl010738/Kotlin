package com.kotlin.demo6

//匿名函数
//匿名函数是无法被调用的，其主要作用是在Lamda表达式中

fun main(args: Array<String>) {
    fun(x: Int, y: Int) = x + y

    val s = arrayOf("abc", "123")

    //Lamda表达式
    s.filter { it.length > 2 }

    //匿名函数
    s.filter(fun(it): Boolean = it.length > 2)
}