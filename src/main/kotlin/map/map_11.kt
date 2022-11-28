package map

fun main() {
    val map = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    var resultMap = map.filterValues { it > 2 }
    println(resultMap)

    resultMap = map.filterKeys { it == "two" }
    println(resultMap)

    resultMap = map.filter { it.key == "two" || it.value == 4 }
    println(resultMap)
}