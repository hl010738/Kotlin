package com.kotlin.demo6

//参数使用Lamda表达式

//compute参数是使用Lamda表达式定义
fun fun1(a: Int = 1, b: Int = 2, compute: (x: Int, y: Int) -> Unit){
    compute(a, b)
}

fun fun2(a: Int = 2, b: Int = 5) = println(a + b)

fun main(args: Array<String>) {
    fun1(2, 3, ::fun2) //::引用既有方法fun2

    //将自定义的方法传入Lamda参数
    //与java不同，Lamda参数不需要加括号
    fun1(2, 3, {a, b -> println(a + b)})

    //如果方法中最后一个参数是Lamda表达式
    //那么这个Lamda表达式的参数也可以放置到方法执行体中，也就是大括号里面
    //这里a, b -> println(a + b)为第三个参数
    fun1(2, 3) {
        a, b -> println(a + b)
    }

    fun1(0){
        a, b -> println(a + b)
    }

    fun1{
        a, b -> println(a + b)
    }
}