package com.kotlin.`object`


open class parent(){
    open val name = "parent"
}

class child: parent(){
    override val name = "child"
}

open class Parent2(){
    open fun method(){
        println("parent method")
    }
    open val name: String get() = "parent"
}

class Child2(): Parent2(){
    override fun method() {
        super.method()
    }

    override val name: String get() = super.name
}