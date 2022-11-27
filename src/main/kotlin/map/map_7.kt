package map

fun main () {
    val myMap = mapOf(1 to "Oybek", 5 to "Sonbe", 3 to "Abduqodir")

    for (key in myMap.keys){
        println("Elements at $key = ${myMap.get(key)}")
    }
    println("myMap.iterator()")
    for (iter in myMap.iterator()){
        println("key = ${iter.key} value = ${iter.value}")
    }
}