package com.kotlin.demo8

/*
    Kotlin 与 Java 互操作
 */

fun main(args: Array<String>) {
    val list = ArrayList<String>()

    list.add("a")
    list.add("b")
    list.add("c")

    for (item in list){
        println(item)
    }

    println("--------------")

    for (i in 0 until list.size){
        println(list[i])
    }

    println("--------------")

    var person = Person()

    person.age = 10
    person.isMarried = false
    person.name = "zhangsan"



}