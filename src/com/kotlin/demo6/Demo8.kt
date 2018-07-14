package com.kotlin.demo6



// Lamda表达式

fun main(args: Array<String>) {
    val s = arrayOf("abcgdfs", "defdsf", "DhRFFi", "jkLBB")

    s.filter { it.contains("e") }.forEach { println(it) }

    println("------------------")

    s.filter { it.length == 6 }.forEach { println(it) }

    println("----------------")

    s.filter { it.endsWith("B", ignoreCase = true) }.map { it.toUpperCase() }.forEach { println(it) }
}