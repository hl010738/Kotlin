package com.kotlin.demo8

/*
    Kotlin 与 Java 互操作 平台类型 platform types

    Java的所有引用类型都是允许为null，而Kotlin对null的检查和限制是非常严格的. 这就使得Kotlin程序引用Java对象时可能会出现不匹配的情况.
    基于此Kotlin对来自Java的声明类型称为平台类型(platform-types). Kotlin对平台类型的null检查就不再这么严格，是的语义与Java一致.
    当Kotlin调用平台类型引用的方法时，就不会在编译期施加null安全检查，但是在运行时仍有可能抛出null指针异常.
 */

fun main(args: Array<String>) {
    var list = ArrayList<String>()
    list.add("abc")

    val s1: String? = list[0]
    val s2: String = list[0]
}