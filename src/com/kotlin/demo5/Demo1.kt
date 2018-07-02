package com.kotlin.demo5

//委托(delegation)
//类委托

interface MyInterface{
    fun myPrint()
}

class MyInterfaceImpl(val string: String): MyInterface{
    override fun myPrint() {
        println("MyInterfaceImpl $string")
    }
}

class MyClass(myInterface: MyInterface): MyInterface by myInterface{

//    如果本类也提供了同名的方法，则会优先调用自身的方法
//    override fun myPrint() {
//        println("MyClass")
//    }
}

fun main(args: Array<String>) {
    var myInterface = MyInterfaceImpl("abc")
    var myClass = MyClass(myInterface)

    myClass.myPrint()
}