package com.kotlin.`object`

/**
 *
 * 星投影 Star projection
 *
 * **/

class Star<out T>{

}

class Star2<in T>{
    fun setValue(t: T){

    }
}

class Star3<T>(private var t: T){
    fun getValue(): T{
        return this.t
    }
    fun setValue(t: T){
        this.t = t
    }
}

fun main(args: Array<String>){
    val star1: Star<Number> = Star<Int>()
    val star2: Star<*> = star1

    val star3: Star2<Int> = Star2<Number>()
    val star4: Star2<*> = star3
    //star4.setValue("111")  compile error

    val star5 = Star3<String>("hello")
    val star6: Star3<*> = star5

    star6.getValue()
    // star6.setValue(111) compile error


}