package com.kotlin.demo2

class OuterClass4{
    class NestedClass4{
        init {
            println("嵌套类初始化块执行")
        }
    }
}

fun main(args: Array<String>) {
    var nestedClass4: OuterClass4.NestedClass4 = OuterClass4.NestedClass4()
}