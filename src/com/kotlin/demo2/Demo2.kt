package com.kotlin.demo2

//内部类
class OutClass{

    private val str = "123"

    inner class InnerClass{
        fun innerClassMethod() = this@OutClass.str
    }
}

fun main(args: Array<String>) {
    println(OutClass().InnerClass().innerClassMethod())
}