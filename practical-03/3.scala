object question {
    def getAverage(num1: Int, num2: Int): BigDecimal = {
        BigDecimal((num1.toDouble + num2.toDouble) / 2).setScale(2, BigDecimal.RoundingMode.HALF_UP)
    }

    def main(args: Array[String]): Unit = {
        println(getAverage(26, 1))
    }
}