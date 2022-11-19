package while_do_while

fun main() {
    var a = 1
    do {
        println(a)
        a += 1
        if (a == 6) {
            break
        }
    } while (a > 0)
}