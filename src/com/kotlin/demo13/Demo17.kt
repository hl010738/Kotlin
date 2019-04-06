package com.kotlin.demo13

import kotlin.reflect.full.memberFunctions

/*
    反射 方法调用
 */

class MyClass5{
    fun something(name: String){
        println("something: $name")
    }

    fun nothing(){
        println("nothing")
    }
}

fun main() {
    val myClass5 = MyClass5::class
    val class5 = MyClass5()

    var method = myClass5.memberFunctions.find { it.name == "nothing" }
    method?.call(class5)

    println("------------")

    method = myClass5.memberFunctions.find { it.name =="something" }
    method?.call(class5, "123")

}