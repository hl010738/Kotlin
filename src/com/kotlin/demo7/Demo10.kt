package com.kotlin.demo7

/*
    注解使用处目标(use-site target)

    在对类的属性或是主构造方法的参数声明注解时，由于Kotlin元素编译为JVM字节码时
    会对应多个Java元素. 因此，在生成的Java字节码中，就会存在多个可能的位置来生成对应的注解.
    若想精确的指定如何来生成注解，那么可以使用注解的使用处目标方式来实现.
 */

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.VALUE_PARAMETER)
annotation class AnnotationD

class class4(@field: AnnotationD val arg1: String,
             @get: AnnotationD val arg2: String,
             @param: AnnotationD val arg3: String)