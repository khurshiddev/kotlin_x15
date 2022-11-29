package overloading

fun over(a: Int){}
fun over(a:Int,b:String){}
fun over(a:Int,b:String,d:Double){}

fun main () {
    over(14)
    over(31,"Kotlin")
    over(2020,"Hyundai",15000.0)
}