package exception

import java.lang.ArithmeticException

fun main(){
   try {
       val firstNumber = 50 / 2 * 0
       try {
           val secondNumber = 100 / firstNumber
           secondNumber
       }catch (exception:ArithmeticException){
           println("ArithmeticException")
       }
   }catch (exception:NumberFormatException){
       println("NumberFormatException")
   }
}