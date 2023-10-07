package exception


fun main(){
    try {
        var ar = arrayOf(1,2,3,4,5)
        var int = ar[6]
        println(int)
        //finally block always executes
        //xattoki exception bersa xam
    }finally {
        println("This block always executes")
    }
}