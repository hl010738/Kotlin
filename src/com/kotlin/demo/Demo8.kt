package com.kotlin.demo

fun main(args: Array<String>) {

    var a:Int = 1
    var b = 2

    if (a in b..10){
        println("in the range")
    }

    if (a !in b..10 ){
        println("out the range")
    }
    println("------------")

    for (i in 2..10){ // 这里..的本质是.rangeTo方法, 步进值默认为1
        println(i)
    }

    println("--------------")

    for (i in 2..10 step 2){
        println(i)
    }

    println("-------------")

    //从10到2
   for (i in 10 downTo 2 step 2){ //不能这么写 for (i in 10..2 step 2){
        println(i)
    }
}