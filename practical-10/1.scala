import scala.io.StdIn.readLine

object question {
    class Rational(n: Int, d: Int) {
        def neg: Rational = new Rational(-n, d)

        def string: String = { n + "/" + d}

        // def double: Double = { n / d }
    }

    def getNumerator(): Int = {
        readLine("Enter Numerator: ").toInt
    }

    def getDenominator(): Int = {
        val value = readLine("Enter Denominator: ").toInt
        if (value == 0) {
            println("ERROR: Zero cannot be the denominator")
            getDenominator()
        } else {
            value
        }
    }

    def main(args: Array[String]): Unit = {
        val numerator = getNumerator()
        val denominator = getDenominator()

        val rational = new Rational(numerator, denominator)
        val negRational = rational.neg

        println("Rational number: " + rational.string)
        println("Negative of the rational number: " + negRational.string)
    }

}