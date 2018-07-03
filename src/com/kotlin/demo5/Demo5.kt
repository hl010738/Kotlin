package com.kotlin.demo5

import kotlin.properties.Delegates

//可观察属性
class Class5{
    var age: Int by Delegates.observable(20){
        prop, oldValue, newValue -> println("${prop.name}, oldValue: $oldValue, newValue: $newValue")
    }

    var price: Int by Delegates.vetoable(20) { prop, oldValue, newValue ->
        when {
            oldValue <= newValue -> true
            else -> false
        }
    }
}

fun main(args: Array<String>) {
    var class5 = Class5()
    class5.age = 30
    class5.age = 40

    println("-------------------")

    class5.price = 30
    println(class5.price)

    //不会被赋值
    class5.price = 10
    println(class5.price)
}