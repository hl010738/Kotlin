package com.kotlin.demo13

/*
    构造方法引用 Constructor reference

    注意2点：
    1. 函数对象的参数要与构造方法的参数保持一致 体现在参数的个数和类型
    2. 函数对象的返回结果要和构造方法的返回结果保持一致，
 */

class B(var x: Int)

fun method(factory: (Int) -> B){
    var b: B = factory(10)
    println(b.x)
}

fun main() {
    method(::B) //构造方法引用
}