package com.kotlin.demo7

/*
    异常 Exception

    Kotlin的try-catch体系是一个表达式，这个表达式的返回值是try里面的最后一条语句的返回值，
    或者是某个catch的返回值(即便有多个catch，最终也是只会进入一个catch).
 */

fun main(args: Array<String>) {
    var i = "a"

    var result: Int? = try {
        Integer.parseInt(i)
    }catch (e: NumberFormatException){
        null
    }finally {
        println("finally")
    }

    println(result)
}