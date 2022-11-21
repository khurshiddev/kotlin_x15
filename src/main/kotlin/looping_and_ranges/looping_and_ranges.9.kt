package looping_and_ranges

fun main() {
    var sum = 0
    for (row in 0 until 8) {
        if (row % 2 == 0) {
            continue
        }
        for (column in 0 until 8) {
            sum += row * column
        }
    }
}