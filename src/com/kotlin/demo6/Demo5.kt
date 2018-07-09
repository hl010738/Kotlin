
/*
    Lamda表达式与高阶函数(high-order function)

    Lamda表达式格式要求：
    1.一个Lamda表达式总是被一对花括号所包围
    2.其参数(如果有)位于 -> 之前，参数类型可以省略，并且不需要圆括号
    3.执行体位于 -> 之后

    在Kotlin中，如果一个函数的最后一个参数是函数，那么可以将Lamda表达式作为实参传递进方法体内
    并且可以在调用时在方法的圆括号外去使用
 */

// (Int, Int) -> Int 是参数类型
val mutiply: (Int, Int) -> Int = {a, b -> a * b}

val add = {a: Int, b: Int -> a + b}

//完整的写法是 val action: () -> Unit = { println("123")}
val action = { println("123")}

// "_" 下划线是代表一个参数但是不会在执行体被使用的参数
val mayReturnNull: (Int, Int) -> Int? = {_, _ -> null}

// 整个方法返回空
val functionMaybeNull: ((Int, Int) -> Int)? = null