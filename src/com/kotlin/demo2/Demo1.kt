package com.kotlin.demo2

//嵌套类
class OuterClass{
    private val str = "hello"

    class NestedClass(){
        fun nestedMethod() = "welcome"
    }
}

fun main(args: Array<String>) {
    println(OuterClass.NestedClass().nestedMethod())
}