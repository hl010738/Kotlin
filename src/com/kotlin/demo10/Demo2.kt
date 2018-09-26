package com.kotlin.demo10

/*
    以下构造方法会被重载为
    Class2(int x, String y)
    Class2(int x)
 */
class Class2 @JvmOverloads constructor(x: Int, y: String = "123"){
    fun method(a: Int, b: Int, c: Int = 2){
        println("a: $a, b: $b, c: $c")
    }
}