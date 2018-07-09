package com.kotlin.demo6

//内联函数

inline fun add(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    println(add(3, 5))
}