package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)

  //tests
  println(str.startsWith("Hello"))

  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberString = "42"
  val aNumber = aNumberString.toInt
  println('a'+: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  //Scala specific: String interpolators

  // S-interpolators
  val name = "Shivam"
  val age = 22
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I am ${age + 1} years old"

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per min"
  println(myth)

  //raw-interpolator
  println(raw"this is a \n newline")
  val escaped = "this is a \n newline"
  println(raw"$escaped")
}
