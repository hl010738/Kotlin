package com.kotlin.demo5

import java.util.*


//map属性委托
class Class6(map: Map<String, Any?>){
    val name: String by map
    val age: Int by map
    val score: Double by map
    val birthday: Date by map
}

class Class66(map: MutableMap<String, Any?>){
    val address: String by map
}

fun main(args: Array<String>) {
    val c6 = Class6(mapOf("name" to "zhangsan", "age" to 18, "score" to 98.5, "birthday" to Date()))

    println(c6.name)
    println(c6.age)
    println(c6.score)
    println(c6.birthday)

    println("-----------------")

    var map: MutableMap<String, Any?> = mutableMapOf("address" to "beijing")

    var cc6 = Class66(map)

    println(map["address"])
    println(cc6.address)

    println("---------------------")

    //address的值已经委托给map来维护，只需要修改map中的值就行修改类中的值
    map["address"] = "shanghai"
    println(map["address"])
    println(cc6.address)



}