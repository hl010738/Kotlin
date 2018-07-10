package com.kotlin.demo6

//Lamda表达式

fun myCaculator(a: Int, b: Int, caculator: (Int, Int) -> Int): Int{
    return caculator(a, b)
}

fun main(args: Array<String>) {
    println(myCaculator(2, 3, {x, y -> x + y}))
    println(myCaculator(2, 3, {x, y -> x - y}))
    println(myCaculator(2, 3, {x, y -> x * y}))

    println("-----------------")

    println(myCaculator(2, 3){
        x, y -> x + y
    })
}