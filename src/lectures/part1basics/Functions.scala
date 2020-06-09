package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN U NEED LOOPS, USE RECURSION
  // MUST specify return type in a recursive function

  //side effect function can be used when there is need to print something on console and not related to real computation
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aGreetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am "+age+ " years old"
  }

  println(aGreetingFunction("shivam", 22))

  def aFactorialFunction(n: Int): Int = {
    if(n==1) 1
    else n * aFactorialFunction(n-1)
  }

  println(aFactorialFunction(5))

  def aFibonacciFunction(n: Int): Int = {
    if(n==1 || n==2) 1
    else aFibonacciFunction(n-1) + aFibonacciFunction(n-2)
  }

  println(aFibonacciFunction(5))

  def checkPrime(n:Int): Boolean = {
    def isPrimeUntil(t: Int) : Boolean =
      if(t <= 1) true
      else n%t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }

  println(checkPrime(5))
}
