package com.kotlin.demo13

/*
    属性引用(Properties reference) 类属性 静态属性
    属性引用与方法引用的方式一致：都是使用”类名::属性名”的方式获取. 如果是顶层属性则类名省略.
    表达式::a 表示类型KProperties<Int>的属性对象，可以通过get方法获取其值，也可以通过name属性来获取该对象的属性名

    对于可变属性var b = 5，::b 返回的是类型KMutableProperty类型的一个实例，他拥有一个set方法
 */

const val a = 3

var b = 5

fun main(){
    println(::a)
    println(::a.get())
    println(::a.name)

    println("-------")

    ::b.set(10)
    println(::b)
    println(::b.get())
}