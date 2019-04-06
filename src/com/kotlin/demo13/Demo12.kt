package com.kotlin.demo13

/*
    反射 范型的属性类型
 */
class MyClass<K, V>{
    var k: K? = null
    var v: V? = null
}

fun main() {
    var myClass = MyClass::class
    println(myClass.typeParameters)
    println(myClass.typeParameters.size)

    println("first param: " + myClass.typeParameters[0])
    println("second param: " + myClass.typeParameters[1])

    println("--------")


}