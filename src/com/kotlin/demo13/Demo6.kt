package com.kotlin.demo13

/*
    反射，属性引用 实例属性
 */
class Demo6(var x: Int)

fun main(){
    val values = listOf("a", "aaa", "aaaaa")
    println(values.map (String::length)) //属性引用，length属性

    println("------------")

    var x = Demo6::x
    println(x.get(Demo6(10))) //x是成员属性，也就是实例属性，因此调用时要传递一个参数标识是哪个实例调用
}