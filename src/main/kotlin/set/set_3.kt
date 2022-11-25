package set
//SetBasic

fun main() {
    val nums = setOf(11, 7, 4, 8, 9, 2, 3)

    val len = nums.count()
    val max = nums.max()
    val min = nums.min()
    val sum = nums.sum()
    val avg = nums.average()

    val msg = """
        max: $max, min: $min,
        count: $len, sum: $sum,
        average: $avg
    """.trimIndent()

    println(msg)
}