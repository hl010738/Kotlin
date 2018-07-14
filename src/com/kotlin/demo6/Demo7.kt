package com.kotlin.demo6

//Lamda表达式例子

fun String.filter(predicate: (Char) -> Boolean): String{
    var buff = StringBuffer()
    for (index in 0 until length){
        var c = get(index)
        if(predicate(c)){
            buff.append(c)
        }
    }
    return buff.toString()

}

fun main(args: Array<String>) {

    var str = "abc123"

    println(str.filter { it -> it.isLetter() })

    println("------------------")

    println(str.filter { it ->
        when(it){
            '1', '2', '3' -> true
            else -> false
        }
    })
}