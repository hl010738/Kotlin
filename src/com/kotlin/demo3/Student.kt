package com.kotlin.demo3


class Student(private var name: String, private var age: Int, private var clazz: String){
    fun printInfo(){
        println("name = $name, age = $age, class = $clazz")
    }
}


class Student2(private var name: String = "aaa"){

}