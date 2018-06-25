package com.kotlin.demo3

interface A1{
    fun method(){
        println("com.kotlin.demo3.A")
    }
}

interface AA1{
    fun method(){
        println("com.kotlin.demo3.A")
    }
}

open class B{
    open fun method(){
        println("com.kotlin.demo3.B")
    }
}

class C: A1, AA1, B(){
    override fun method() {
        super<A1>.method()
        super<AA1>.method()
        super<B>.method()
        println("com.kotlin.demo3.C")
    }
}

fun main(args: Array<String>) {
    var c = C()
    c.method()
}