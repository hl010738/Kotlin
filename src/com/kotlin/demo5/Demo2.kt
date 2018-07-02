package com.kotlin.demo5

import kotlin.reflect.KProperty

//属性委托

class MyDelegate{
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String{
        return "$thisRef, your delegate property name is $property"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String){
        println("$thisRef, new value is $value")
    }
}

class MyPropertyClass{
    var str by MyDelegate()
}

fun main(args: Array<String>) {
    val propertyClass = MyPropertyClass()

    propertyClass.str = "123"
    println(propertyClass.str)
}