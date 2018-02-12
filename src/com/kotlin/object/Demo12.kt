package com.kotlin.`object`

import kotlin.test.assertTrue

class ParameterizedClass<A>(private val value: A){
    fun getValue(): A{
        return this.value
    }
}

//相当于java ParameterizedProducer<? extends T>
class ParameterizedProducer<out T>(private var value: T){
    fun get(): T{
        return value
    }
}

class ParameterizedConsumer<in T>{
    fun toString(value: T): String {
        return value.toString()
    }
}

fun main(args: Array<String>) {
    var p = ParameterizedClass<String>("aaa")
    var result = p.getValue()

    assertTrue { result is String }

    println("---------------")

    var parameterizedProducer = ParameterizedProducer<String>("bbb")
    var result1: ParameterizedProducer<Any> = parameterizedProducer

    //相当于以下两行代码
    //List<String> list1 = new ArrayList<>();
    //List<? extends Object> list2 = list1;

    assertTrue { result1 is ParameterizedProducer<Any> }

    println("-------------------")

    var parameterizedConsumer = ParameterizedConsumer<Number>()
    var result2: ParameterizedConsumer<Int> = parameterizedConsumer

    assertTrue { result2 is ParameterizedConsumer<Int> }

    //相当于以下两行代码
    //List<Number> list1 = new ArrayList<>();
    //List<? super Integer> list2 = list1;
}