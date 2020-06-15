package lectures.part2oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("hahahaha")
  }
  println(funnyAnimal.getClass)
  /*
  * class AnonymousClasses$$anon$1 extends Animal {
  *   override def eat: Unit = println("hahahaha")
  * }
  * val funnyAnimal: Animal = new AnonymousClasses$$anon$1
  * */


}
