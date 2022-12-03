package `when`

fun main() {
    var num = 8
    when(num) {
        3,4,5,6 ->
            println("It is summer season")
        7,8,9, ->
            println("It is rainy season")
        10,11 ->
            println("it is aotumn season")
        12,1,2 ->
            println("it is winter season")
        else -> println("invalid input")
    }
}