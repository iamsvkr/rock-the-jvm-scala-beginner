package lectures.part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY ("static") it has even better "Objects"
  object Person{
    // "static"/class" level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobby")
  }
  class Person(val name: String) {
    // instance level functionality
  }
  // COMPANIONS

  
  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = SINGLETON instance
  val mary = new Person("mary")
  val john = new Person("john")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobby = Person(mary, john)

  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit
}
