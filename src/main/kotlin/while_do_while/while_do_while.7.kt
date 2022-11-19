package while_do_while

fun main () {
    var sum =0
    var input = ""

    do {
        print("Enter a integer: ")
        input = readln()
        sum +=input.toInt()
    }while (input!= "0")
    println("sum = $sum")
}