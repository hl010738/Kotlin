package com.kotlin.demo2

//内部类
class OutClass{

    private val str = "123"

    inner class InnerClass{
        fun innerClassMethod() = this@OutClass.str
    }

    //局部嵌套类
    fun getName(): String{
        class LocalNestedClass(){
            val name = "My test"
        }

        var localNestedClass = LocalNestedClass()
        return localNestedClass.name
    }
}

fun main(args: Array<String>) {
    println(OutClass().InnerClass().innerClassMethod())
}