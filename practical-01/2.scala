object convertTemp {
    def convertToFahr(cel: Double): Double = {
        ( cel * 1.8 ) + 32.0
    }

    def main(args: Array[String]): Unit = {
        var cel: Double = 35
        printf("Fahrenheit of %.2f = %.2f\n", cel, convertToFahr(cel))
    }
}