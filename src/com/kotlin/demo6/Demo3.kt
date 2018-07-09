package com.kotlin.demo6

/*
    中缀符号(infix notation)

    函数可以通过中缀符号的形式来调用，但需要满足以下3个条件:

    1.是成员函数或者扩展函数
    2.拥有单个参数
    3.声明时使用infix关键字
 */

class InfixTest(private var a: Int){
    infix fun add(b: Int) = this.a + b
}

fun main(args: Array<String>) {
    var infixTest = InfixTest(5)

    //以下两种方式是等价的
    println(infixTest.add(3))
    println(infixTest add 3) //这种类型就是中缀符号
}