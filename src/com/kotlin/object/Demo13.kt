package com.kotlin.demo13.`object`


//如果泛型类只是将泛型类型作为返回类型，可以使用out关键字
interface Producer<out T>{
    fun produce(): T
}

//如果泛型类只是将泛型类型作为方法的输入类型，可以使用in关键字
interface Consumer<in T>{
    fun consume(t: T)
}

open class Fruit

open class Apple: Fruit()

class ApplePear: Apple()

class FruitProducer: Producer<Fruit>{
    override fun produce(): Fruit {
        println("fruit producer")
        return Fruit()
    }
}

class AppleProducer: Producer<Apple>{
    override fun produce(): Apple {
        println("apple producer")
        return Apple()
    }
}

class ApplePearProducer: Producer<ApplePear>{
    override fun produce(): ApplePear {
        println("apple pear producer")
        return ApplePear()
    }
}

class HumanConsumer: Consumer<Fruit>{
    override fun consume(t: Fruit) {
        println("Human consume fruit")
    }
}

class ManConsumer: Consumer<Apple>{
    override fun consume(t: Apple) {
        println("Man consume apple")
    }
}

class boyConsumer: Consumer<ApplePear>{
    override fun consume(t: ApplePear) {
        println("boy comsume apple pear")
    }
}

fun main(args: Array<String>) {

    //对于out泛型类型，可以将子类型对象赋值给父类型的引用
    var producer1: Producer<Fruit> = FruitProducer()
    var producer2: Producer<Apple> = AppleProducer()
    var producer3: Producer<ApplePear> = ApplePearProducer()

    println("-------------------")

    //对于in泛型类型，可以将父类型对象传递给子类型引用
    var consumer1: Consumer<ApplePear> = HumanConsumer()
    var consumer2: Consumer<ApplePear> = ManConsumer()
    var consumer3: Consumer<ApplePear> = boyConsumer()
}

