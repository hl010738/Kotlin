package com.kotlin.demo2


//Kotlin中内部类方位外部类的方法是：this@OuterClass.method
//Java中内部类访问外部类的方法是：OuterClass.this.method
class Person(val name: String, val age: Int){

    private val str = "外部类属性"

    private inner class PersonFeature(val height: Int, val weight: Int){

        private val str = "内部类属性"

        fun getFeature(){
            val str = "方法局部属性"
            println("身高: $height, 体重: $weight")
            //这里的this@Person实际上是内部类维护了一个外部类的一个引用
            this@Person.method()

            println("${this@Person.str}")
            println("${this.str}")
            println(str)
        }
    }

    private fun method(){
        println("调用了Person类里面的method方法")

    }

    fun getPerson(){
        val personFeature = PersonFeature(180, 60)
        personFeature.getFeature()
    }
}

fun main(args: Array<String>) {
    val person = Person("zhangsan", 30)
    person.getPerson()
}