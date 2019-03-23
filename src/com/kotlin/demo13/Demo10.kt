package com.kotlin.demo13

/*
    对象的方法和属性的引用
 */

fun main(){
    val str = "123"
    val methodReference = str::get
    println(methodReference(1))

    println("----------")

    //对象的引用的调用方式
    val fieldReference = "abc"::length
    println(fieldReference.get())

    println("------------")

    //类的引用的调用方式
    val lengthReference = String::length
    println(lengthReference.get("abd"))
}