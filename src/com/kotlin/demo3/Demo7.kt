package com.kotlin.demo3

object myObject{
    var a: String = "com.kotlin.demo3.myObject"
    fun printInfo(){
        println(a)
    }
}

class MyClass{

    companion object myObject{
        var a = "companion object"

        @JvmStatic
        fun printInfo(){
            println(MyClass.myObject.a)
        }
    }
}

fun main(args: Array<String>) {

    println(MyClass.myObject.javaClass)

    //com.kotlin.demo3.MyClass.com.kotlin.demo3.myObject.printInfo()
    //println(com.kotlin.demo3.MyClass.a)
    //com.kotlin.demo3.MyClass.printInfo() //实现类似java的, static方法调用
}