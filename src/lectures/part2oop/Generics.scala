package lectures.part2oop

object Generics extends App {

  class MyList[+A] {
    def add[B >: A](element: B): MyList[B] = ???
  }

  class MyMap[key, value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes List[Cat] extends List[Animal] = COVARIANT
  class CovariantList[+A]
  val animal: Animal = new Cat
  val covariantList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ??? => HARD QUESTION

  // 2. No = Invariance
  class InvariantList[A]
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell No => CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  // upper bound type
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
//  val car = new Cage(new Car)
}
