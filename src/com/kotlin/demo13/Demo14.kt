package com.kotlin.demo13

import kotlin.reflect.full.memberProperties


/*
    反射 获取成员属性
 */
class MyClass2(var str: String, var flag: Boolean, var age: Int)

fun main() {
    val myClass2 = MyClass2::class
    println(myClass2.memberProperties)
}