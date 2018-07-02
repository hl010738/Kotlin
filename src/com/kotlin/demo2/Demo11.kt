package com.kotlin.demo2

import java.awt.event.ActionEvent
import java.awt.event.ActionListener

//对象声明
object MyObject{
    fun getObject() = "abc"
}

//对象表达式
object listener: ActionListener{
    override fun actionPerformed(e: ActionEvent?) {
    }
}