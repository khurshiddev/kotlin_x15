package if_else

fun main () {
    val colors = "Blue"
    when (colors) {
        "Red" -> println("Stop")
        "Green", "Blue" -> println("Slow")
        "BLack" -> println("Go")
        else -> println("Invalid colors")
    }
}