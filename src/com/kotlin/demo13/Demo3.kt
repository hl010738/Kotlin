package com.kotlin.demo13

/*
    函数(方法)引用
    支持重载

    ::multiply 表示函数类型 (Int)->Int 的值
 */

fun multiply(x: Int): Int{
    return 3 * x
}

fun multiply(s: String): Int{
    return 10
}

//::multiply 表示函数类型 (Int)->Int 的值
//因此可以赋值给一个变量
var ref: (Int) -> Int = ::multiply
var reff: (String) -> Int = ::multiply
var re:String.(Int) -> Char = String::get

fun main(){
    val list1 = listOf(1, 2, 3, 4)
    println(list1.map(::multiply))

    println("--------")

    val list2 = listOf("1", "2", "3", "4")
    println(list2.map(::multiply))
}