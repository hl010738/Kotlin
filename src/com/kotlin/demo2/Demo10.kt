package com.kotlin.demo2

//枚举类型

enum class Season{
    SPRING, SUMMER, AUTUMN, WINTER
}

enum class Season2(val tempurature: Int){
    SPRING(tempurature = 10), SUMMER(30), AUTUMN(20), WINTER(-10)
}

//枚举中声明方法
enum class Season3(val tempurature: Int){
    SPRING(tempurature = 10){
        override fun getSeason(): Season3 = SPRING
    },
    SUMMER(tempurature = 30){
        override fun getSeason(): Season3 = SUMMER
    },
    AUTUMN(tempurature = 20){
        override fun getSeason(): Season3 = AUTUMN
    },
    WINTER(tempurature = -10){
        override fun getSeason(): Season3 = WINTER
    };
    abstract fun getSeason(): Season3
}

fun main(args: Array<String>) {
    val seasons = Season.values()
    seasons.forEach { println(it) }

    println("-----------------")

    val season = Season.valueOf("SPRING")
    println(season.name)
}