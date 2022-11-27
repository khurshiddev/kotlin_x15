package map

fun main () {
    val map = mapOf(1 to "Uzbekistan", 2 to "Canada", 3 to "America",4 to "Korea")
    println("Team having map #1 is: "+map[1])
    println("Team having map #3 is: "+map.getValue(3))
    println("Team having map #4 is: "+map.getOrDefault(4,0))

    val met = map.getOrElse(2,{0})
    println(met)
}