package com.kotlin.demo

fun main(args: Array<String>) {

    var list = intArrayOf(1, 2, 3, 4)

    for (it: Int in list){
        println(it)
    }

    println("--------------")

    for (i: Int in list.indices){
        println("list[$i] = ${list[i]} ")
    }

    println("---------------")

    //同时遍历索引和值
    for ((i, v) in list.withIndex()){
        println("list[$i] == $v")
    }
}