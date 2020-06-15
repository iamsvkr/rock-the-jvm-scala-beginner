package playground

object ScalaPlayground extends App {
  abstract class Pet[A] {
    def printSomething(): A
  }

  class Cat extends Pet[Int] {
    override def printSomething(): Int =
      2
  }

  val cat: Pet[Int] = new Cat
  println(cat.printSomething())
}
