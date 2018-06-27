package com.kotlin.demo2

//对象表达式访问外层变量

fun main(args: Array<String>) {
    var i = 100

    var obj = object {
        fun method(){
            println(i++)
        }
    }

    obj.method()
}