package constructor

fun main() {
    val sample = Sample("Abdrurohman")

}

class Sample constructor(val name: String) {
    constructor(name: String, age: Int) : this(name)
    constructor(name: String, age: Int, birthday: String) : this(name, age)
}