package com.kotlin.`object`

//extension 扩展

class ExtensionTest{

    fun add(a: Int, b: Int): Int = a + b

    fun substract(a: Int, b: Int): Int = a - b
}

fun ExtensionTest.multiply(a: Int, b: Int): Int = a * b

val ExtensionTest.a get() = "aaa"


open class AA
class BB: AA()

fun AA.a() = "a" //给AA类扩展a()方法
fun BB.a() = "b" //给BB类扩展a()方法

fun printA(aa: AA){
    println(aa.a())
}

fun AA?.toString(): String{
    if(null != this){
        return toString()
    }else {
        return "null"
    }
}

fun main(args: Array<String>) {
    printA(AA()) //运行结果是调用父类AA的 a() 方法
    printA(BB()) //运行结果也是调用AA的 a() 方法，与java 不用
                //原因是参数声明的是AA的实例，所以只会调用AA的扩展方法
}