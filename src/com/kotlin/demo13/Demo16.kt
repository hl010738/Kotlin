package com.kotlin.demo13

/*
    反射 获取构造方法
 */

class MyClass4(var amout: Int){
    constructor(amount: Int, flag: Boolean): this(amount){
        println("secondary constructor")
    }

    constructor(amount: Int, str: String): this(amount){
        println("secondary constructor")
    }

    fun doSomething(){
        println("something")
    }
}

fun main() {
    val myClass4 = MyClass4::class
    var constructors = myClass4.constructors

    println(constructors)
}
