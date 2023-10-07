package constructor

class Person04{
    var name:String
    var age:Int

    init {
        println("Initializer block")
    }

    constructor(_name:String,_age:Int){
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Name = $age")
    }
}
fun main(){
    val person01 = Person04("Oybek",30)
}