package com.kotlin.demo

import javax.sound.midi.Soundbank


fun main(args: Array<String>) {

    var a = 10
    var b = 20

    var max: Int
    var min: Int

//    max = if (a > b) a else b
//    min = if (b > a) a else b

    max = if (a > b) {
        println("max :a")
        a
    } else {
        println("max: b")
        b
    }

    min = if (a < b){
        println("min a")
        a
    } else {
        println("min b")
        b
    }

    println("max: $max, min: $min")

}