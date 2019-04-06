package com.kotlin.demo13

import kotlin.reflect.KClass

/*
    无论多少个实例获取到的KClass对象都是同一个
 */
fun main() {
    val kotlinLand = "kotlin"
    var kclass: KClass<out String> = kotlinLand::class
    println(kclass)

    println("----------")

    val kclass1: KClass<out String> = "kotlin"::class
    val kclass2: KClass<out String> = "java"::class

    println(kclass1)
    println(kclass2)
    println(kclass1 == kclass2)

    println("-----------")

    //获取对应java类的KClass对象
    val kclass4 = Class.forName("java.util.Date").kotlin
    println(kclass4)

    println(kclass4 == Class.forName("java.util.Date"))
    println(kclass4 == Class.forName("java.util.Date").kotlin)

}