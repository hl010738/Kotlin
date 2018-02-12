

object myObject{
    var a: String = "myObject"
    fun printInfo(){
        println(a)
    }
}

class MyClass{

    companion object myObject{
        var a = "companion object"

        @JvmStatic
        fun printInfo(){
            println(a)
        }
    }
}

fun main(args: Array<String>) {

    println(MyClass.myObject.javaClass)

    //MyClass.myObject.printInfo()
    //println(MyClass.a)
    //MyClass.printInfo() //实现类似java的, static方法调用
}