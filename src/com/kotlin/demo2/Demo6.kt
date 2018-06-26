package com.kotlin.demo2

//对象表达式
interface Interface1{
    fun print1(i: Int)
}

abstract class AbstractClass1{
    abstract val age: Int
    abstract fun printAbustractClass1()
}

fun main(args: Array<String>) {
    var myObject = object: Interface1{
        override fun print1(i: Int) {
            println("i的值是$i")
        }
    }

    myObject.print1(100)

    println("---------------")

    var myObject2 = object {
        init {
            println("myObject2初始化块执行")
        }
        var str = "123"
        fun method() = "abc"
    }

    println(myObject2.str)
    println(myObject2.method())

    println("-----------------")

    var myObject3 = object: Interface1, AbstractClass1(){
        override fun print1(i: Int) {
            println("i的值是$i")
        }

        override val age: Int
            get() = 200

        override fun printAbustractClass1() {
            println("Abtract class print")
        }
    }
    myObject3.print1(200)
    println(myObject3.age)
    myObject3.printAbustractClass1()

}