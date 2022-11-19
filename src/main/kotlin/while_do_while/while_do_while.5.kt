package while_do_while

fun main() {
    var counter = 1
    var sum = 0
    while (counter<=10) {
        println(counter)
        sum+=counter
        counter++
    }
    println("Total sum: $sum")
}