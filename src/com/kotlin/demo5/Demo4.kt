package com.kotlin.demo5

import kotlin.properties.Delegates

//非空属性
class MyClass4{
    var address: String by Delegates.notNull()
}

fun main(args: Array<String>) {
    var c = MyClass4()
    c.address = "abc"
    println(c.address)
}