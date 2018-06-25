package com.kotlin.demo3


open class parent1(){
    open val name = "com.kotlin.demo3.parent"
}

class child1: parent1(){
    override val name = "com.kotlin.demo3.child"
}

open class Parent2(){
    open fun method(){
        println("com.kotlin.demo3.parent method")
    }
    open val name: String get() = "com.kotlin.demo3.parent"
}

class Child2(): Parent2(){
    override fun method() {
        super.method()
    }

    override val name: String get() = super.name
}