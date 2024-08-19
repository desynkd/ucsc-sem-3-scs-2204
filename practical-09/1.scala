import scala.io.StdIn.readLine

object question {
    def main(args: Array[String]): Unit = {
        val calculateInterest: Double => Double = input => input match {
            case x if x <= 20000 => x * 0.02
            case x if x <= 200000 => x * 0.04
            case x if x <= 2000000 => x * 0.035
            case x if x > 2000000 => x * 0.065
        }

        val input: Double = readLine("Enter Deposit Amount: ").toDouble
        println("Amount of interest earned: " + calculateInterest(input))
    }
}