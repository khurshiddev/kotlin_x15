package constructor

class Person02{
    var name:String
    var age:Int
    var salary:Double

    //first secondary cons
    constructor(_name:String,_age:Int){
        this.name = _name
        this.age = _age
        this.salary = 0.00
        println("Name = $name")
        println("Age = $age")
    }

    //second secondary cons
    constructor(_name: String,_age: Int,_salary:Double){
        this.name = _name
        this.age = _age
        this.salary = _salary
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
    }
}

fun main(){
    val person01 = Person02("Oybek",29)
    val person02 = Person02("Oybek",29,36.000)
}