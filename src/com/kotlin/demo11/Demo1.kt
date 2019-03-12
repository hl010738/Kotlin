package com.kotlin.demo11

import java.io.FileNotFoundException

/*
    Kotlin中，不存在checked exception
 */
class Demo1{

    //这个注解是在方法被Java调用时，告诉Java会抛出异常
    //这样Java可以使用try-catch来捕获
    //否则java代码的try-catch会报错
    @Throws(FileNotFoundException::class)
    fun method(){
        println("method invoked")
        throw FileNotFoundException()
    }
}