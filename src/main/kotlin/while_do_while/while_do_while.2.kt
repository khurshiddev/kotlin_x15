package while_do_while

fun main() {
    val num = 5
    var i = 1

    do {
        println("$num * $i = " + num * i)
        i++
    } while (i < 10)
}