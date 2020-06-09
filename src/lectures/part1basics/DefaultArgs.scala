package lectures.part1basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if(n <= 1) acc
    else trFact(n-1, acc * 10)

  val fact10 = trFact(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture(width = 800)

  /*
  * pass in every loading arg
  * or name of the arg
  * */

  savePicture(height = 600, width = 800, format = "bmp")
}
