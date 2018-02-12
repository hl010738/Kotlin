package com.kotlin.dataclass

data class Person(val name: String, var age: Int, var address: String)

fun main(args: Array<String>) {
    var person = Person("aaa", 20, "beijing")
    //解构，将person中的属性值依次赋给变量
    var(name, age, address) = person
}