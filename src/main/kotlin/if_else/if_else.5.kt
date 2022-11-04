package if_else

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    println("enter a number")
    val num: Int = input.nextInt()

    if (num > 50)
        println("number is big")
    else
        println("number is'nt big")
}