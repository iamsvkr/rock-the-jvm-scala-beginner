package lectures.part2oop

object Inheritance extends App {

  // single class inheritance
  sealed class Animal {
    val creatureType: String = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal{
    def crunch: Unit = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    override def eat = {
      super.eat
      println("crunch crunch")
    }
  }
  val dog = new Dog("domestic")
  dog.eat

  // type substitution (polymorphism)
  val unKnownAnimal: Animal = new Dog("K9")
  unKnownAnimal.eat

  // overriding vs overloading

  // super

  // preventing override
  // 1. keyword final on member
  // 2. use final on class
  // 3. seal the class => extend class in this file only and not in other files
}
