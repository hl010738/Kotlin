package com.kotlin.demo13

/*
    反射，属性引用 扩展属性
 */

val String.firstChar: Char
    get() = this[0]

fun main(){
    println(String::firstChar.get("123"))
}