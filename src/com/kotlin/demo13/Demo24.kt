package com.kotlin.demo13

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredMemberProperties

/*
    反射 属性操作
 */

class MyClass12{
    var name = "123"
    val price = 10
}

fun main() {
    var myClass12 = MyClass12::class
    var obj = myClass12.createInstance()

    var fields = myClass12.declaredMemberProperties

    fields.forEach{
        when (it.name){
            "name" ->{
                val kmp = it as KMutableProperty1<MyClass12, Any>
                kmp.set(obj, "qqqq")
                println(it.get(obj))
            }
            "price" -> {
                println(it.get(obj))
            }
        }

    }
}