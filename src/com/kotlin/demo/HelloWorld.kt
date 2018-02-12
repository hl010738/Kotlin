package com.kotlin.demo

import java.util.function.Consumer

    fun main(arg: Array<String>){

        val list : List<String> = listOf("aaa", "bbb", "ccc")

        for (str in list){
            println(str)
        }

        println("----------------")

        list.forEach(Consumer { println(it) })

        println("---------------")

        list.forEach(System.out::println)
}

