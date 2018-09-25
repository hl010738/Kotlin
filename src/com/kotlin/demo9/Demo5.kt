package com.kotlin.demo9

/*
    JvmStatic

    在Kotlin中，将具名对象和伴生对象中定义的函数注解为@JvmStatic，
    这样编译器既会在相应的对象类中生成静态方法，也会在对象自身中生成实例方法.
 */
class Class5{
    companion object {
        fun test1(){
            println("test1")
        }

        @JvmStatic
        fun test2(){
            println("test2")
        }
    }
}