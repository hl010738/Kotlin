package com.kotlin.`object`

import kotlin.test.assertTrue

// use-site variance(type projection)类型投影

//数组浅拷贝
fun copy(from: Array<out Any>, to: Array<Any>){
    assertTrue { from.size == to.size }

    for (i in from.indices){
        to[i] = from[i]
    }
}

fun setValue(to: Array<in String>, index: Int, value: String){
    to[index] = value
}

fun main(args: Array<String>){
    val from: Array<Int> = arrayOf(1, 2, 3, 4)
    val to: Array<Any> = Array<Any>(4, {it -> "Hello$it" })

    copy(from, to)

    for (i in to){
        println(i)
    }

    println("-------------------")

    val array = Array(4, {"hello"})

    for (i in array.indices){
        println(array[i])
    }

    setValue(array, 1, "world")

    println("-------------------")

    for (i in array.indices){
        println(array[i])
    }

    println("-------------------")

    val array2 = Array<Any>(4, {it -> "hello$it"})

    for (i in array2.indices){
        println(array2[i])
    }

    println("-------------------")

    setValue(array2, 1, "world")

    for (i in array2.indices){
        println(array2[i])
    }
}