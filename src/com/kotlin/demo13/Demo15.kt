package com.kotlin.demo13

import kotlin.reflect.full.memberFunctions

/*
    反射 获取方法
 */
class MyClass3{
    fun doSomething(){
        println("something")
    }

    fun doNothing(){
        println("nothing")
    }
}

fun main() {
    val myClass3 = MyClass3::class
    println(myClass3.memberFunctions)
}