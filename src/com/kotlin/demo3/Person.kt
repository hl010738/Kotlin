package com.kotlin.demo3


class Person constructor(username: String){

    private var username: String
    private var age: Int
    private var address: String

    init {
        println("1111111111111")
        this.username = username
        this.age = 20
        this.address = "beijing"
    }

    //secondary构造方法必须直接或者间接调用primary构造方法
    constructor(username: String, age: Int): this(username){

        println("2222222222222")
        this.address = "shanghai"
        this.age = age
    }

    constructor(username: String, age: Int, address: String): this(username, age){
        println("333333333333")
        this.address = address
    }

    fun printInfo(){
        println("username = $username, age = $age, address = $address")
    }
}

fun main(args: Array<String>) {

    val p1 = Person("zhangsan")
    println("*******************")
    val p2 = Person("lisi", 30)
    println("*******************")
    val p3 = Person("wangwu", 50, "guangzhou")

    p1.printInfo()
    p2.printInfo()
    p3.printInfo()
}