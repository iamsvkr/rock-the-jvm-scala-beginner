package exercises

import java.time.Year

object OOBasics extends App {
  val writer = new Writer("shivam", "kumar", 22)
  println(writer.fullName())
  val novel = new Novel("hello", 1996, writer)
  println(novel.authorAge())
  println(novel.isWrittenBy())

  val counter = new Counter
  counter.inc.inc(5).print
}

class Writer(firstName: String, surName: String, val year: Int) {

  def fullName(): String = {
    firstName + " " + surName
  }
}

//name is a parameter and year is a field
class Novel(name: String, val year: Int, author: Writer) {
  def authorAge(): Int = {
    author.year
  }

  def isWrittenBy(): String = {
    author.fullName()
  }
}

class Counter(val count: Int = 0) {

  // immutability
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  //overloading
  def inc(n: Int): Counter = {
    if(n <= 0) this
    else inc.inc(n-1)
//    new Counter(count+n)
  }

  def dec(n: Int): Counter = {
    if(n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)
}
