package com.kotlin.demo13

import kotlin.reflect.full.memberProperties

/*
    反射 属性调用
 */
class MyClass6{
    var name: String = "123"
}

fun main() {
    val myClass6 = MyClass6::class
    val class6 = MyClass6()

    var property = myClass6.memberProperties.find { it.name == "name" }
    println(property?.get(class6))
    println(property?.call(class6))
}