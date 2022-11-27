package map

fun main () {
    val colors = mapOf(
        "red" to 1, "orange" to 2, "yellow" to 3,
        "green" to 4, "blue" to 5, "indigo" to 6, "violet" to 7
    )
    var color = "yellow"
    if (colors.containsKey(color)) {
        println("Yes, it contains color $color")
    }else{
        println("No, it does not contain color $colors")
    }
    val value = 8
    if (colors.containsValue(value)){
        println("Yes, it contains value $value")
    }else {
        println("No, it does not contain value $value")
    }
}