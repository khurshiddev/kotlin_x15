package map

fun main () {
    val map = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    map.forEach {
            k, v -> println("Key = $k, Value =$v")
       }
    }
