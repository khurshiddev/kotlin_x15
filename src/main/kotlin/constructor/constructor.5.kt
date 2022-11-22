package constructor

class Person{
    var name: String
    var age: Int


    init {
        println("Initializer Block")
    }

    constructor ( _name: String, _age: Int) {
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }
}

fun main(args: Array<String>) {
    val oybek = Person("Oybek", 28)
}