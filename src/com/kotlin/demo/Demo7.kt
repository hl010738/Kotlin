package com.kotlin.demo

fun main(args: Array<String>) {

    println(print("aaa"))
    println(print("bbb"))
    println(print("ccc"))
    println(print("hello"))

    println("-----------------")

    var t = 20

    var result = when(t){

        1 -> {
            println("t is 1")
            10
        }
        2 -> {
            println("t is 2")
            20
        }
        3, 4, 5 -> {
            println("t is 3 or 4 or 5")
            30
        }
        in 6..10 -> {
            println("t is between 6 to 10")
            40
        }
        else -> {
            println("else")
            50
        }
    }
    println(result)
}


fun print(str: String): String{
//    when(str){
//        "aaa" -> return str.toUpperCase()
//        "bbb" -> return str.toLowerCase()
//        "ccc" -> return "***"
//        else -> return "null"
//    }
    return when(str){
        "aaa" -> str.toUpperCase()
        "bbb" -> str.toLowerCase()
        "ccc" -> "***"
        else -> "null"
    }
}