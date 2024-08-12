import scala.io.StdIn.readLine

object question {
  def main(args: Array[String]): Unit = {
    val input: Int = scala.io.StdIn.readLine("Enter an integer : ").toInt

    val result: Int => String = {
        case x if x % 3 == 0 && x % 5 == 0 => "Multiple of Both Three and Five"
        case x if x % 3 == 0 => "Multiple of Three"
        case x if x % 5 == 0 => "Multiple of Five"
        case _ => "Not a Multiple of Three or Five"
    }

    println(result(input))

  }
}