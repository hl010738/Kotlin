package com.kotlin.demo7

/*
    集合
 */

fun main(args: Array<String>) {
    var stringList = mutableListOf("a", "b", "c")
    var readOnlyList: List<String> = stringList

    //使用对象赋值
    // 可变集合修改也会反应在不可变集合中
    stringList.add("d")

    println(readOnlyList)

    println("-------------")

    var list = mutableListOf("a", "b", "c")
    var readOnly: List<String> = list.toList()

    //使用toList方法，只是将当前的可变集合快照赋值给不可变集合
    //可变集合的修改不会反应在不可变集合中
    list.add("d")

    println(readOnly)

}