package com.kotlin.demo5

//延迟属性
val myLazyValy: Int by lazy(LazyThreadSafetyMode.NONE) {
    println("123")
    30
}

fun main(args: Array<String>) {
    println(myLazyValy) //第一次访问时，"123"会被打印
    println(myLazyValy) //第二次访问时，"123"不会被打印
}