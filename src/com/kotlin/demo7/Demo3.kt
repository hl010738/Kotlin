package com.kotlin.demo7

/*
    集合 Map
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

    println("-----------------")

    val map = hashMapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["a"])

    val map2 = HashMap(map)
    println(map2)

}