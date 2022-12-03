package `when`


fun main() {
    var num = 1
    when (num){
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    }
}