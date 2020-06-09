package lectures.part2oop

object OOBasics extends App {
  val person = new Person("shivam", 22)
  println(person.age)
  person.greet("satinder")
}

// constructor
class Person(name: String, val age: Int) {
  // body
  val x = 2
  println(1+2)

  def greet(name: String): Unit = println(s"${this.name} says => Hi $name")
}

// class parameters are not fields