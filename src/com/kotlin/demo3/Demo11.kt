package com.kotlin.demo3

// 密封类
sealed class Caculator

//定义3个子类
class Add: Caculator()
class Substract: Caculator()
class multiply: Caculator()

//必须遍历完Caculator的所有子类，否则报错
fun caculate(a: Int, b: Int, cal: Caculator): Int = when(cal){
    is Add -> a + b
    is Substract -> a - b
    is multiply -> a * b
}

