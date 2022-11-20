package looping_and_ranges

fun main() {
    val chars = ('a'..'k')
    val it = chars.iterator()

    while (it.hasNext()) {
        val e = it.next()
        println(e)
    }
}