package com.kotlin.demo13

import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

/*
     获取class对应的java类型和kotlin类型
 */
class T(var x: Int)

fun main(){
    println(T::x.javaGetter) //获取该属性的java的get方法
    println(T::x.javaField) //获取该属性的java的属性名

    println("--------")

    println(T(10).javaClass) //获取该实例的java类
    println(T(10).javaClass.kotlin) //获取该实例的java类对应的Kotlin的类
}