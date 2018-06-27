package com.kotlin.demo2

class Class1{

    private var object1 = object  {
        fun output(){
            println("output method invoked!")
        }
    }

    fun myTest(){
        object1.output()
    }
}

class Class2{
    private fun test1() = object {
        val str = "123"
    }
    internal fun test2() = object {
        val str = "abc"
    }

    fun test(){
        test1().str
        // test2().str 不可访问str，因为是internal
    }
}

fun main(args: Array<String>) {
    var class1 = Class1()
    class1.myTest()
}