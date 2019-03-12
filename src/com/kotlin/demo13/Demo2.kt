package com.kotlin.demo13

/*
    Kotlin反射 继承
 */
fun main(){
    val son: Parent = Son()

    println(son::class)
    println(son::class.java)
}

open class Parent
class Son: Parent()
