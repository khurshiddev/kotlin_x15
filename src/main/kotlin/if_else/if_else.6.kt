package if_else

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    println("enter a first number: ")
    val num: Int = input.nextInt()
    println("enter second number: ")
    val num2: Int = input.nextInt()
    println("enter third number: ")
    val num3: Int = input.nextInt()


    if (num >= num2 && num >= num3) {
        println("number1 ($num) is greatest")
    } else if (num2 >= num3 && num2>= num) {
        println("number2 ($num2) is greatest")
    }else {
        println("number3 ($num3) is greatest")
    }
}
