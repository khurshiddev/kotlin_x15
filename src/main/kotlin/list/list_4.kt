package list

fun main () {
    var intList: List<Int> = listOf(1,2,3)
    var string: List<String> = listOf("Oybek", "Sonbe","Abduqodir")
    var anyList: List<Any> = listOf(1,2,3,"Oybek", "Sonbe","Abduqodir")
    println("Int List")
    println()
    for (list in intList){
        println(list)
    }
    println()
    println("String List")
    println()
    for (list in string) {
        println(list)
    }
    println()
    println("Any List")
    println()
    for (list in anyList){
        println(list)
    }
}