package constructor

class Car(var brand: String, var model: String, var year: Int)

fun main() {
    val c1 = Car("Hyundai", "Sonata", 2021)
    val c2 = Car("Kia", "Kia k8", 2022)
    val c3 = Car("Tesla", "Model S", 2020)
}