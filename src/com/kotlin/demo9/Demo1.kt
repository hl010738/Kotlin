package com.kotlin.demo9

/*
    Java 调用 Kotlin

    属性(properties)
    一个Kotlin属性(properties)会被编译为3部分Java元素.
        一个setter方法.
        一个getter方法.
        一个私有的字段(field)，其名字与Kotlin的属性名一致.

    如果Kotlin属性名以is开头，那么命名约定会发生一些变化
        getter方法名与属性名一样.
        setter方法名则是将is替换为set.

    这种规则适用于任何类型的属性，而不是仅适用于Boolean.
 */

class Test{
    var str = "abc"

    /*
        这个属性会被编译为
        private String str;
        public String getStr();
        public void setStr(String str);
     */

    //var isStr = "abc" //这样命名会报错，与str的set方法重名

    var isVar = "123"

    /*
        这个属性会被编译为
        private String isVar;
        public String isVar();
        public void setVar();
     */
}