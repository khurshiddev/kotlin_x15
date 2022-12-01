package propery_accessor

class Product(
    val price: Int,
    val discount: Int,
    var stock: Int
) {
    val isSoldOut: Boolean
        get() = stock == 0

    fun subtract() {
        stock--
    }
}
fun main() {
    val product = Product(price = 1000, discount =200, stock = 1)
    product.subtract()
    product.isSoldOut
}