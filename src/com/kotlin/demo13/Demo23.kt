package com.kotlin.demo13

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredFunctions

/*
    反射 实例方法的调用
 */

class MyClass11{
    fun method(str: String){
        println("带String参数的方法：$str")
    }
    fun method(str: String, i: Int){
        println("带String Int参数方法：$str, $i")
    }
}

fun main() {
    var myClass11 = MyClass11::class
    var obj = myClass11.createInstance()

    var funs = myClass11.declaredFunctions

    for (i in funs){
        // 需要考虑反射调用时第一个方法是调用对象
        if (i.parameters.size == 3){
            i.call(obj, "123", 10)
        }
    }
}