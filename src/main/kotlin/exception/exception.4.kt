package exception



fun test(num1: Int, num2: Int): Any {
    return try {
        num1/num2
    }catch (e: Exception){
        println(e)
        "Divide by zero not allowed"
    }
}
fun main () {
    var test1 = test(10,5)
    println(test1)
    var test2 = test(10,0)
    println(test2)

}