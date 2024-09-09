import scala.io.StdIn.readLine

object question {
    class Rational(n: Int, d: Int) {
        def numerator = n
        def denominator = d

        def neg: Rational = new Rational(-n, d)

        def string: String = { n + "/" + d}

        def substract(num: Rational): Rational = {
            val newNumerator = (n * num.denominator) - (num.numerator * d)
            val newDenominator = (d * num.denominator)
            new Rational(newNumerator, newDenominator)
        }
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
        println("Creating X")
        var numerator = getNumerator()
        var denominator = getDenominator()
        val x = new Rational(numerator, denominator) 

        println("Creating Y")
        numerator = getNumerator()
        denominator = getDenominator()
        val y = new Rational(numerator, denominator) 

        val z = x.substract(y)

        println("X: " + x.string)
        println("Y: " + y.string)
        println("Z: " + z.string)
        
    }

}