package lectures.part1basics

object Expressions extends App {
  var aVar = 2
  aVar+=2 // changing the variable value => side effects
  println(aVar)

  // Instructions(do) vs Expression(value)
  // Instructions are executed like in Java and c, c++
  // Expressions are evaluated like in Scala
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // IF is an expression which return a value
  println(aConditionValue)
  println(if(aCondition) 5 else 3)
  println(1+2)

  //avoid while loops as they are sensitive to plaque or they produce side effects
  var i=0
  val aWhile = while(i<10){
    println(i)
    i += 1
  }

  //everything in scala is an expression
  val aWierdValue = (aVar = 3) //Unit === void
  println(aWierdValue)

  // side effects : println(), whiles, reassigning

  //Code Blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "goodbye"
  }
}
