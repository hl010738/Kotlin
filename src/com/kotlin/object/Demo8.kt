package com.kotlin.`object`

class P{
    val age get() = 20

    val name: String get() {
        println("get invoked")
        return "name"
    }

    var address: String = "address"
        get() {
        println("get invoked")
        return field
    }
    private set(value) {
        println("set invoked")
        field = value
    }
}

fun main(args: Array<String>) {
    var p = P()
    println(p.age)
}