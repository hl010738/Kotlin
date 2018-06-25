package com.kotlin.demo3


open class Fruit1{
    open fun name(){
        println("Fruit")
    }

    fun expirationDate(){
        println("1 month")
    }
}

open class Orange: Fruit1(){
    final override fun name() {
        println("orange")
    }
}


class Apple1: Fruit1(){
    override fun name(){
        println("apple")
    }
}

fun main(args: Array<String>) {

}