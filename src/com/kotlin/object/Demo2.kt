

open class parent(name: String){
}

class child2: parent{
    constructor(name: String): super(name)
}

class child(name: String, age: Int): parent(name){

}

