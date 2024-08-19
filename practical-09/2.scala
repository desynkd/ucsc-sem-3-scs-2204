import scala.io.StdIn.readLine

object question {
    def main(args: Array[String]): Unit = {
        val calculateInt: Int => String = input => input match {
            case x if x <= 0 => "Negative/Zero"
            case x if x % 2 == 0 => "Even Number"
            case _ => "Odd Number"
        }

        val input: Int = readLine("Enter Integer: ").toInt
        println("Output: " + calculateInt(input))
    }
}