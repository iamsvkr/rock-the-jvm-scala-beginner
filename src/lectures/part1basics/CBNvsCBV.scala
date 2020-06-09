package lectures.part1basics

object CBNvsCBV extends App {

  // In this first value is evaluated and then called
  def callByValue(x: Long): Unit = {
    println("by value : " + x)
    println("by value : " + x)
  }

  // In this System.nanoTime() is called twice
  def callByName(x: => Long): Unit = {
    println("by name : " + x) // println("by name " + System.nanoTime())
    println("by value : " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  // this returns error
  //  printFirst(infinite(), 34)

  // and this does not as call by name function is delayed till it is used
  printFirst(34, infinite())
}
