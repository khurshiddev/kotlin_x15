package constructor

//primary constructor
//Car01 has 3 parameters
class Car01(var brand:String,var model:String,var year:Int)

fun main(){
    val c1 = Car01("nexia","chevrolet",1999)
    val c2 = Car01("tiko","chevrolet",1991)
    val c3 = Car01("lasetti","chevrolet",2000)
}