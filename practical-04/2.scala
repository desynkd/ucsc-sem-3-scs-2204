object question {
    def main(args: Array[String]): Unit = {
        val input = args(0).toInt

        (input) match {
            case input if input <= 0 => println("Negative/Zero is input")
            case input if input % 2 == 0 => println("Even number is given")
            case _ => println("Odd number is given")
        }
    }
}