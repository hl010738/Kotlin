package com.kotlin.demo13

import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter
import kotlin.reflect.jvm.javaSetter

/*
    反射 属性操作
 */

class MyClass14{
    var name = "aaa"
    var price = 10
}

var test1 = "test1"

fun main() {
    var topProp = ::test1

    println(topProp.javaField)
    println(topProp.javaGetter)
    println(topProp.javaSetter)

    var name = MyClass14::name
    println(name.javaField)
    println(name.javaGetter)
    println(name.javaSetter)

}