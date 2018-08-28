package com.kotlin.demo7

/*
    解构声明与可变集合
*/
fun main(args: Array<String>) {
    val map = mapOf("a" to "aa", "b" to "bb", "c" to "cc")
    for ((key, value) in map) {
        println("key is $key, value is $value")
    }

    println("--------------------")

    map.mapValues { entry -> "${entry.value} hello" }.forEach{ println(it)}

    map.mapValues { (key, value) -> {"$value world"} }.forEach { println(it) }

    map.mapValues { (_, value) -> {"$value welcome"} }.forEach { println(it) }

    println("---------------------")

    //Kotlin允许我们为结构声明整体指定类型，也可以为具体的某一个Component指定类型.
    map.mapValues { (_, value): Map.Entry<String, String> -> {"$value person"}}.forEach { println(it) }

    map.mapValues { (key, value: String) ->  {"$value person"}}.forEach { println(it) }
}