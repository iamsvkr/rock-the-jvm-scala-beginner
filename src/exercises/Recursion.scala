package exercises

import scala.annotation.tailrec

object Recursion extends App {
  // concatenate string using tail recursion
  def concatenateString(n: Int): String = {
    def tailFunction(n: Int, value: String): String =
      if(n == 0) value
      else tailFunction(n-1, value+"hello")

    tailFunction(n, "")
  }
  println(concatenateString(10))

  // IsPrime function tail recursive
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else n%t!=0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }

  def isPrimeNew(n: Int): Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if(!isStillPrime) false
      else if(t <= 1) true
      else isPrimeTailRec(t-1, n%t!=0)

    isPrimeTailRec(n/2, true)
  }

  println(isPrimeNew(2003))
  println(isPrimeNew(20))

  // Fibonacci function
  def Fibonacci(n: Int): Int = {
    def tailFibonacci(t: Int, prev1: Int, prev2: Int): Int =
      if(t==1 || t==2) 1
      else if(t==3) prev1 + prev2
      else tailFibonacci(t-1, prev2, prev1 + prev2)

    tailFibonacci(n, 1, 1)
  }
  println(Fibonacci(5))
}
