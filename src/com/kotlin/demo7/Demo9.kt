package com.kotlin.demo7

import kotlin.reflect.KClass

/*
    注解也可以拥有自己的构造方法，并且构造方法也可以接受参数
    注解构造方法的参数只能是val

    注解构造方法所允许的参数类型：
        与java原生数据类型对应的类型(Int, Long...)
        字符串String
        classes: (Myclass: class)
        枚举enums
        其他的注解
        上述类型的数组类型

    Kotlin的注解参数是不允许为可空类型的，原因是JVM是不允许以NULL的形式存储注解属性值的

 */
annotation class AnnotationA(val str: String)

@AnnotationA("123")
class class1

annotation class AnnotationB(val str: String, val annotationA: AnnotationA)

@AnnotationB("abc", AnnotationA("123"))
class class2


/*
    如果需要将某个class作为注解的参数，那么请使用Kotlin class (KClass)
    Kotlin编译器会自动将其转换为Java class
    这样，Java代码就可以正常的看到注解与参数了
 */

annotation class AnnotationC(val arg1: KClass<*>, val arg2: KClass<out Any>)

@AnnotationC(String::class, Int::class)
class class3