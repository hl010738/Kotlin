package com.kotlin.demo7

/*
    异常 Exception throw
    Throw在Kotlin中是个表达式，这样我们可以将throw作为Elvis表达式的一部分
    Throw表达式的类型是一种特殊的类型：Nothing
 */

fun main(args: Array<String>) {
    var str: String? = "a"
    var str2 = str ?: throw IllegalArgumentException("值不能为空")

    println(str2)
    println("----------------")

    str = null
    var str3: String? = str ?: method()
    println(str3)

}

fun method(): Nothing{
    throw IllegalArgumentException()
}