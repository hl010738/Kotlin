package com.kotlin.demo7

/*
    注解 Annotation
    元注解 meta-annotation 用于描述自定义注解的注解
 */

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.TYPE, AnnotationTarget.FUNCTION, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
annotation class MyAnnotation

@MyAnnotation
class Class1{

    @MyAnnotation
    fun method(){

    }
}