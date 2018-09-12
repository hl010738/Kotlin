package com.kotlin.demo8

/*
    可变参数
 */

fun main(args: Array<String>) {
    val myVarargs = MyVarargs()
    val array = arrayOf("a", "b", "c")

    //myVarargs.method(array) 不能这样传递
    myVarargs.method(*array)
}