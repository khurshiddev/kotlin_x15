package set


data class Car(var name: String, var price: Int)

fun main() {
    val nums = setOf(11, 5, 8, 4, 9, 7, 2)
    val sortAsc = nums.sorted()
    println(sortAsc)

    val sortDesc = nums.sortedDescending()
    println(sortDesc)

    val revNums = nums.reversed()
    println(revNums)

    val cars = setOf(
        Car("Hyundai", 20000), Car("Kia", 15000),
        Car("Genesis", 40000), Car("Volvo", 25000)
    )

    val res = cars.sortedBy { car -> car.name }
    res.forEach { e -> println(e) }

    println("***********")
    val res2 = cars.sortedByDescending { car -> car.name }
    res2.forEach { e -> println(e) }


}