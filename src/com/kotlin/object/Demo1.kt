package com.kotlin.`object`


//Kotlin中，一个类可以有一个primary构造方法以及一个或者多个secondary构造方法.

//primary构造方法是类头(class header)的一部分，它位于类名后面，可以拥有若干参数.

//- 如果构造方法没有任何注解或者可见性关键字修饰(eg:private)，那么constructor关键字可以省略.

class MyClass (username: String, password: String){

    private var username = username.toUpperCase()
    private var password: String = password.toUpperCase()

    init {
        println("username = $username")
        println("password = $password")
    }
}

fun main(args: Array<String>) {

    var mc: MyClass = MyClass("aaa", "bbb")
}