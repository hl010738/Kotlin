package com.kotlin.composite

open class Parent{
    open fun name(){
        println("parent")
    }
}

class Child: Parent(){
    override fun name(){
        super.name()
        println("child")
    }
}

fun main(args: Array<String>) {
    var c:Parent = Parent()
    c.name()
}