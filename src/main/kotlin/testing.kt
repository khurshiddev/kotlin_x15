

fun main () {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val result = findNumber(5,numbers)
    println(result)
}

fun findNumber(value:Int,numbers:List<Int>):Boolean{
    for (a in numbers){
        if (a == value){
            return true
        }
    }
    return false

}
