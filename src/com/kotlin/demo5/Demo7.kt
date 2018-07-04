package com.kotlin.demo5

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

//提供委托

class A7{
    val name: String by DelegateLauncher()
    val address: String by DelegateLauncher()
}

//这里类似一个工厂
class DelegateLauncher{
    operator fun provideDelegate(thisRef: A7, property: KProperty<*>): ReadOnlyProperty<A7, String>{
        println("Launcher invoked")

        //这里可以动态的控制为什么属性提供委托
        when(property.name){
            "name", "address" -> return A7Delegate()
            else -> throw Exception("Invalid name")
        }
    }
}

class A7Delegate: ReadOnlyProperty<A7, String>{
    override fun getValue(thisRef: A7, property: KProperty<*>): String {
        return "hello word"
    }
}

fun main(args: Array<String>) {
    var a = A7()
    println(a.name)
    println(a.address)
}