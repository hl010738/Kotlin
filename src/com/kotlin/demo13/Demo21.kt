package com.kotlin.demo13

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.functions

/*
    反射 方法调用
 */

class MyClass9(value: Int = 0){

    fun nothing(){
        println("nothing")
    }

    companion object{
        fun something(){
            println("something")
        }
    }
}

fun main() {
    var myClass9 = MyClass9::class
    var obj = myClass9.createInstance()

    myClass9.functions.find { it.name == "something" }?.call(obj)
    myClass9.functions.find { it.name == "nothing" }?.call(obj)
}