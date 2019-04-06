package com.kotlin.demo13

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.memberProperties

/*
    反射 属性赋值
 */
class MyClass7{
    var name = "abc"
    var addr = "123"
}

fun main() {
    val myClass7 = MyClass7::class
    val class7 = MyClass7()

    val pname = myClass7.memberProperties.find { it.name == "name" }
    println(pname?.get(class7))

    println("--------------")

    if (pname is KMutableProperty<*>){
        pname.setter.call(class7, "bbbbbbb")
    }

    println(pname?.get(class7))



}