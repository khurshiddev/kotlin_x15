package constructor

fun main () {
    Sample2("Abdurohman",31," 8 July")
}
class Sample2 {
    init {
        println("Sample init")
    }

    constructor(name: String) {
        println("name $name")
    }

    constructor(name: String, age: Int) : this(name) {
        println("name $name,age $age")
    }
    constructor(name: String, age: Int, birthday: String): this(name, age) {
        println("name $name. age $age birthday $birthday")
    }
}