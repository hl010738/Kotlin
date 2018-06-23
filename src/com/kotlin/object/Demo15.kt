package com.kotlin.`object`


//泛型函数

fun <T> getValue(item: T): T{
    return item
}

fun main(args: Array<String>){
    val item = getValue(3)
    println(item)

    val item2 = getValue("hello")
    println(item2)

}

class UpperBoundClass<T: List<T>>

class UpperBoundClass2<T> where T: Comparable<T>, T: Any