package com.kotlin.demo7

/*
    范围 Range
 */

fun main(args: Array<String>) {

    var i = 5

    if (i in 1..5){
        println(i)
    }

    println("----------------")

    for (a in 1..4){
        println(a)
    }

    println("-----------------")

    for (a in 4 downTo 1 ){
        println(a)
    }

    println("---------------")

    for (a in 1..10 step 2){
        println(a)
    }

    println("----------------")

    for (a in 1 until 4){
        println(a)
    }
}