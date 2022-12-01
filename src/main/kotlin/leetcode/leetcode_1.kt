package leetcode

fun main() {
    val count = countOdds(3, 7)
    println(count)

}

fun countOdds(low: Int, high: Int): Int {
    var low2 = low
    var high2 = high
    if (low % 2 == 0) {
        low2 += 1
    }
    if (high % 2 == 0) {
        high2 -= 1
    }
    if (high2-low2 == 0) return 1
    return ((high2-low2)/2)+1


}


