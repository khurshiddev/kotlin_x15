package exception

import java.lang.ArithmeticException

fun main(){
    val firstName = 10
    var secondNum = 1
    secondNum--
    try {
        println(firstName/secondNum)
    }catch (e:ArithmeticException){
        println("nol bolish hatolik yuzaga keldi")
    }
    println("end of the application")
}