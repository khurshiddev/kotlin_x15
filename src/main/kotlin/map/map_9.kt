package map

fun main () {
    val map = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    if (map.containsKey("two")){
        println(true)
    }else{
        println(false)
    }


    if(map.containsValue(2)){
        println(true)
    }else{
        println(false)
    }

}