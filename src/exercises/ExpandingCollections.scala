package exercises

object ExpandingCollections extends App {

  trait MyPredicate[-T] {
    def test(n: T): Boolean
  }

  class EvenPredicate extends MyPredicate[Int] {
    def test(n: Int): Boolean =
      if(n%2==0) true
      else false
  }
  val evenPredicate = new EvenPredicate
  println(evenPredicate.test(9))

  trait MyTransform[-A, B] {
    def transform(n : A): B
  }

  class StringToIntTransformer extends MyTransform[String, Int] {
    override def transform(n: String): Int = n.toInt
  }
  val stringToIntTransformer = new StringToIntTransformer
  println(stringToIntTransformer.transform("10"))

  class MyList {
    
  }
}
