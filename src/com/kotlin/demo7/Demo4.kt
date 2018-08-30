package com.kotlin.demo7

/*
    集合 List
 */

fun main(args: Array<String>) {
    var list = listOf(1, 2, 3, 4)

    println(list.first())
    println(list.last())

    println("----------------")

    list.filter { it%2 == 0 }.forEach { println(it) }

    println("-----------")

    var l = mutableListOf(1, 2, 3)
    println(l.requireNoNulls())

    println("----------------")

    if(l.none { it > 10 }){
        println("没有大于10的元素")
    }

    println(l.firstOrNull())
    println(l.lastOrNull())

    println("----------------")

}