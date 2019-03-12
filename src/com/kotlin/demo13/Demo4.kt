package com.kotlin.demo13

/*
    函数组合
 */

//参数 f 是一个 只有一个B类型的参数，返回C类型值的 函数
//参数 g 是一个 只有一个A类型的参数，返回B类型值的 函数
//返回值是一个 A类型的参数，返回值是C类型的 函数
//这样可以将 g 作为参数 传给 f ，并返回 f
fun<A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C{
    return {x -> f(g(x))}
}

fun isEvent(x: Int) = 0 == x % 2
fun length(s: String) = s.length

fun main(){
    val list = listOf("1", "12", "123", "1234")
    val c: (String) -> Boolean = compose(::isEvent, ::length)
    println(list.filter(c))
}