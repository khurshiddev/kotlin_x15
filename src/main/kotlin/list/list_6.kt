package list

fun main() {
    val nums = listOf(11, 5, 3, 8, 1, 9, 6, 2)
    val count = nums.count()
    val max = nums.max()
    val min = nums.min()
    val sum = nums.sum()
    val avg =nums.average()
    println("count = $count, " +
            "max = $max, " +
            "min = $min, " +
            "sum = $sum, " +
            "average = $avg")
}