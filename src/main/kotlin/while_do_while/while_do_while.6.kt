package while_do_while

fun main() {
    var counter =11
    var sum =0
    do{
        println(counter)
        sum+=counter
        counter++
    }while (counter<=10)
    println("Total sum $sum")
}