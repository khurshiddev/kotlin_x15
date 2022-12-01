package leetcode

class Solution {
    fun average(salary: IntArray): Double {
        val max = salary.max()
        val min = salary.min()
        var avgSalary =salary.filter { it != max && it != min }.toIntArray().average()
        return avgSalary

    }
}

fun main() {
    val sol = Solution()
    println(sol)
}