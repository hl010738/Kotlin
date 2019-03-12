package com.kotlin.demo13

/*
    Kotlin 反射
 */
fun main(){
    var c = String::class //KClass
    println(c)

    println("--------")

    val cc = String::class.java //java class
    println(cc)
}