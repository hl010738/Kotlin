package com.kotlin.demo6

//在默认情况下，Lamda表达式中最后一个表达式的值会隐式作为给表达式的返回值.
// 但是可以通过全限定的return语法来显示的从Lamda表达式返回值. 使用的语法是return@filter

fun main(args: Array<String>) {
    val string = arrayOf("abc", "123", "tgb")

    string.filter {
        val s = it.length > 3
        s
    }

    string.filter {
        val s = it.length > 3
        return@filter s
    }
}