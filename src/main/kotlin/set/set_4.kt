package set

//SetIndex
fun main() {
    val words = setOf(
        "dog", "person", "computer",
        "iphone", "cup", "cheese", "cup", "toster"
    )

    val w1 = words.elementAt(0)
    println(w1)

    val w2 = words.indexOf("cup")
    println("The first index of cup is $w2")

    val w3 = words.lastIndexOf("cup")
    println("The last index of cup is $w3")
}