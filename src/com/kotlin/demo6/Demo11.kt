package com.kotlin.demo6

//闭包: 一个Lamda表达式或者匿名函数可以访问在其作用域外层所声明的变量

fun main(args: Array<String>) {

    //sum就称为闭包，可变
    //java中不允许
    var sum = ""

    var string = arrayOf("a", "bc", "123")

    string.filter { it.length > 2 }.forEach {
        sum += it
    }
}