package com.kotlin.demo


fun main(args: Array<String>) {

    println(conver2UpperCase(111))
}

fun conver2UpperCase(str: Any): String?{

    if (str is String){ //is 关键字 类似 java 中的 instanceof
        return str.toUpperCase()
    }
    return null
}