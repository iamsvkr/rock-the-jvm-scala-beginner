package lectures.part1basics

object Recursion extends App {
  //this function generate stack overflow for larger values
  def Factorial(n: Int): Int =
    if(n <= 1) 1
    else n * Factorial(n-1) // STACK recursion

  //this function works for larger values
  def newFactorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if(x <= 1) accumulator
      else factHelper(x-1, x * accumulator) // TAIL recursion => use recursive call as the LAST expression
    }
    factHelper(n, 1)
  }
  println(newFactorial(20))

  // WHEN U NEED LOOPS USE TAIL RECURSION


}
