package com.kotlin.demo3


class DD{
    fun method_DD(){
        println("DD method")
    }
}

class EE{
    fun method_EE(){
        println("EE method")
    }
    fun DD.method_DD_EE(){ //此扩展方法只能在EE类中使用，不能在其他地方调用
        method_DD()
        method_EE()
    }
    fun callDDMethod(dd: DD){//此扩展方法只能在EE类中使用，不能在其他地方调用
        dd.method_DD_EE()
    }
    fun output(){
        println(toString()) //DD 的toString
        println(this@EE.toString()) //EE 的toString
    }
}
