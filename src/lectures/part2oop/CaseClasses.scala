package lectures.part2oop

object CaseClasses extends App {
  /*
  * equals, hashcode
  * */

  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  val jim = new Person("Jim", 22)
  println(jim.name)

  // 2. sensible toString
  // println(instance) == println(instance.toString) // syntactic sugar
  println(jim)

  // 3. equals and hashCode are implemented OOTB
  val jim2 = new Person("Jim", 22)
  println(jim == jim2)

  // 4. CCs have handy copy methods
  val jim3 = jim.copy(age = 32)
  println(jim3)

  // 5. CCs have companion objects
  val thePerson = Person
  val mary = Person("mary", 22)

  // 6. CCs are serializable
  // Akka

  // 7. CCs have extractor patterns = CCs can be used in pattern matching

  case object India {
    def name: String = "India"
  }

  
}
