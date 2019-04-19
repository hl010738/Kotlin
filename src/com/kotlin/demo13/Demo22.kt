package com.kotlin.demo13

import kotlin.reflect.full.createInstance

/*
    反射 构造方法调用
 */

class MyClass10(var name: String){

    var price = 0.0

    constructor(): this("123"){
        println("无参构造方法")
        this.price = 1.1
    }

    constructor(name: String, price: Double): this(name){
        println("2个参数的构造方法")
        this.price = price
    }
}

fun main() {
    var myClass10 = MyClass10::class
    var obj = myClass10.createInstance()

    println(obj.name)
    println(obj.price)

    var constructors = myClass10.constructors

    constructors.forEach{
        if(it.parameters.size == 2){
            it.call("aaa", 2.2)
        }
    }

}