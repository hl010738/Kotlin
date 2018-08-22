package com.kotlin.demo7

/*
    解构声明
 */

data class MyResult(val message: String = "success", val status: Int = 1)

fun myMethod(): MyResult{
    return MyResult()
}
//可以使用Kotlin内置的Pair类来返回2个属性值
fun myMethod2(): Pair<String, Int>{
    return Pair("ABC", 1)
}

//可以使用Kotlin内置的Triple类来返回3个属性值
fun myMethod3(): Triple<String, Int, Boolean>{
    return Triple("ABC", 200, true)
}

fun main(args: Array<String>) {
    val myResult = myMethod()
    myResult.message
    myResult.status

    val (message, status) = myMethod()
}