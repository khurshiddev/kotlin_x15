package exception
fun main () {
    try {
        val result = 25 / 0
        result
    } catch (exception: NumberFormatException) {
        println("NumberFormatException ")
    } catch (exception: ArithmeticException) {
        println("ArithmeticException ")
    } catch (exception: Exception) {
        println("Exception ")
    }
}