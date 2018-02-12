package com.kotlin.`object`


open class Fruit{
    open fun name(){
        println("Fruit")
    }

    fun expirationDate(){
        println("1 month")
    }
}

open class Orange: Fruit(){
    final override fun name() {
        println("orange")
    }
}


class Apple: Fruit(){
    override fun name(){
        println("apple")
    }
}

fun main(args: Array<String>) {

}