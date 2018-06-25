package com.kotlin.demo4

open class Parent{
    open fun name(){
        println("com.kotlin.composite.parent")
    }
}

class Child: Parent(){
    override fun name(){
        super.name()
        println("com.kotlin.composite.child")
    }
}

fun main(args: Array<String>) {
    var c: Parent = Parent()
    c.name()
}