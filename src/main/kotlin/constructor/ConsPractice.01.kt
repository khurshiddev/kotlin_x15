package constructor

fun main(){
    val sample01 = Sample01("Oybek")
}

//primary constructor that takes a single parameter name of type String
class Sample01 constructor(val name:String){

    //This is a secondary constructor of the Sample01 class. It takes two parameters: name (a String) and age (an Int).
    constructor(name: String,age:Int):this(name)

    //This is another secondary constructor of the Sample01 class. It takes three parameters: name (a String), age (an Int), and birthday (a String)
    constructor(name: String,age: Int,birthday:String):this(name,age)
}