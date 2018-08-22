package com.kotlin.demo6

/*
    带接受者的函数字面值
    Kotlin提供了这样一种功能：可以通过制定的接受者对象调用一个函数字面值
    在函数字面值内部，你可以调用接受者对象的方法而无需使用任何额外的修饰符

    这一点非常非常类似扩展函数
 */

fun main(args: Array<String>) {

    //Int类型就可以调用subtract
    val subtract: Int.(other: Int) -> Int = {other -> this - other }

    println(1.subtract(3))

    /*
        匿名接受者可以让我们指定含数字面值的接受者类型，这就可以先去声明一个带有接收者的函数类型变量，然后再去使用它.
     */

    val sum = fun Int.(other: Int) = this + other

    println(1.sum(4))

    /*
        带有接受者类型的函数的非字面值可以作为参数传递，前提是所需要接受函数的地方应该有一个接受者类型的参数，反之亦然.
        例如：  类型String.(Int) -> Boolean 与 (String, Int) -> Boolean等价
     */

    val myEquals: String.(Int) -> Boolean = {param -> this.toIntOrNull() == param}
    println("456".myEquals(456))

    fun test(op: (String, Int) -> Boolean, a: String, b: Int, c: Boolean) = println(op(a, b) == c)
    test(myEquals, "200", 200, true)
}
