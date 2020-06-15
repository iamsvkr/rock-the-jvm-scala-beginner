package lectures.part2oop

object Exceptions extends App {

  val x: String = null
  // println(x.length)
  // this will crash with null pointer exceptions
  // throwing exceptions

//  val aWierdValue: String = throw new NullPointerException
  // Exceptions and error are major Throwable subtypes

  // 2. how to catch exceptions
  def getInt(withExceptions: Boolean): Int =
    if(withExceptions) throw new RuntimeException
    else 42

  try {
    // code which throws exceptions
  } catch {
    case e: RuntimeException => println("caught an exception")
  } finally {
    println("finally")
  }

  // 3. how to define our own exceptions
  class MyException extends Exception
  val exception = new Exception

  // task
  class OverFlowException extends RuntimeException
  class UnderFlowException extends RuntimeException

  object PocketCalculator {
    def add(x: Int, y: Int) = {
      val res = x+y
      if(x>0 && y>0 && res<0) throw new OverFlowException
      else if(x<0 && y<0 && res>0) throw new UnderFlowException
      else res
    }
  }

  println(PocketCalculator.add(5, 5))
}
