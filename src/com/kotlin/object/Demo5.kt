

interface A{
    fun method(){
        println("A")
    }
}

interface AA{
    fun method(){
        println("A")
    }
}

open class B{
    open fun method(){
        println("B")
    }
}

class C: A, AA, B(){
    override fun method() {
        super<A>.method()
        super<AA>.method()
        super<B>.method()
        println("C")
    }
}

fun main(args: Array<String>) {
    var c = C()
    c.method()
}