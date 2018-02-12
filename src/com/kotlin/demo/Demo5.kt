package com.kotlin.demo

fun main(args: Array<String>) {

    println(convert2Int("aa"))

}

fun convert2Int(str: String) : Int?{
    try {
        return str.toInt()
    } catch (ex: NumberFormatException){
        return null
    }
}