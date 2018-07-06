package com.kotlin.demo6

//默认参数
fun test(a:Int = 0, b:Int = 1) = println(a - b)

fun main(args: Array<String>) {
    test() //没有传递参数，使用默认参数
    test(2) //按顺序匹配参数a=2
    test(b = 0) //显示传递参数b=0

    println("---------------------")

    println(A().method(5))
    println(B().method(6))
}

//如果一个默认参数位于其他无默认值的参数之前，那么默认值只能通过在调用函数时显示指定参数名的方式来使用.
fun test2(a: Int = 1, b: Int) = a + b

open class A{
    open fun method(a: Int, b: Int = 4) = a + b
}
class B: A(){
    override fun method(a: Int, b: Int) = a + b
}