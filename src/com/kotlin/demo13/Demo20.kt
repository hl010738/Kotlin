package com.kotlin.demo13

import kotlin.reflect.full.companionObject

/*
    反射 半生对象
 */
class MyClass8{
    companion object{
        fun method(){
            println("method")
        }
    }
}

fun main() {
    val myclass8 = MyClass8::class
    var companionObject = myclass8.companionObject

    println(companionObject)

    MyClass8.method()
}