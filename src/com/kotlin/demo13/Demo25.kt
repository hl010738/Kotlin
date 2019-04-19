package com.kotlin.demo13

/*
    反射 属性操作
 */

class MyClass13{
    var name = "123"
    val price = 10
}

var test = "test"

fun main() {
    var topProp = ::test

    topProp.set("aaa")

    println(topProp.get())
    println(test)

    var name = MyClass13::name
    var obj = MyClass13()

    name.set(obj, "tttttt")
    println(name.get(obj))
}