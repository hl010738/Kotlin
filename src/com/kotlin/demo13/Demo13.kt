package com.kotlin.demo13

import java.io.Serializable
import kotlin.reflect.full.superclasses

/*
    反射 接口
 */
class MySerializable: Serializable, MyInterface

interface MyInterface

fun main() {
    val mySerializable = MySerializable::class

    println(mySerializable.superclasses)
}