package overloading

fun main () {
    overLoad("Oybek ")
    overLoad("Oybek",28)

}

fun overLoad(name:String){
    println("name: $name")
}
fun overLoad(name: String,age: Int){
    println("Name: $name, Age: $age")
}