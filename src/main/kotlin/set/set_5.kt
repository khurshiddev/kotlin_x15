package set

fun main() {
    val nums = setOf(6, 4, 7, 2, 5, -2, -5, -3, 11, 9, -10, -7)

    val len = nums.count()
    println("There are $len elements")

    val size = nums.size
    println("The size of the set is $size")

    val num1 = nums.count { e -> e < 0 }
    println("There are $num1 negative values")

    val num2 = nums.count { e -> e % 2 == 0 }
    println("There are $num2 even values ")
}