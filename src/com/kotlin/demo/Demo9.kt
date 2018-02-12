package com.kotlin.demo

fun main(args: Array<String>) {

    var list: List<String> = listOf("aaa", "bbbb", "ccccc")
    var l = listOf<String>("aaa", "bbb", "ccc")


    list.filter { it.length > 3 }.map { str -> str.toUpperCase() }.sorted().forEach(System.out::println)


    println("-----------------")

    for (i in list){
        if ("aaa" == (i)){
            println(i)
        }
    }

    when {
        "aaa" in list -> println("aaa in the list")
    }
}