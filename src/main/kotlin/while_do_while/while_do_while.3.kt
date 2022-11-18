package while_do_while

fun main () {
    var i = 0
    do {
        println(i)
        i++
        var j = 0
        while (j < 5) {
            println("----$j")
            j++
        }
    }while (i < 5)

}

