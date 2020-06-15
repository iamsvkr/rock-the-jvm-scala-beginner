package lectures.part2oop

object MethodNotation extends App {

  class Person(val name: String, favouriteMovie: String) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String = s"${this.name} is hanging with ${person.name}"
    def unary_! : String = s"$name what the heck!"
    def isAlive : Boolean = true
    def apply(): String = s"Hi, my name is $name"

    //exercise
    def +(nickName: String): Person = new Person(s"$name ($nickName)", favouriteMovie)
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent

  // infix notation = operator notation (syntactic sugar)
  // "operators" in Scala

  val tom = new Person("tom", "Fight Club")
  println(mary + tom) // hangout acts as a operator
  println(mary.+(tom))
  println(1+2)
  println(1.+(2))

  //all operators are methods
  // Akka actors have ! ?

  // prefix notation
  val x = -1
  val y = 1.unary_- // they are equivalent
  // unary_prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
//  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())

  println((mary + "the rockstar")())
}
