package exception

fun main () {
    val firstNum = 10
    var secondNum = 1
    secondNum--
    try {
        println(firstNum/secondNum)
    }catch (e:ArithmeticException) {
        println("No'lga bo'lish hatolik yuzaga keldi")
    }
    println("End of the application ")


}