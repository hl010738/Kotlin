package com.kotlin.demo


fun main(args: Array<String>){

    sum4(5, 8)

    println(sum(1, 2))

    println(sum2(2, 4))

    sum3(4, 6)
}

//字符串模版
fun sum4(a: Int, b: Int){
    println("$a + $b = ${a + b}" )
}


fun sum(a: Int, b: Int) : Int{
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun sum3(a: Int, b: Int){
    println(a + b)
}