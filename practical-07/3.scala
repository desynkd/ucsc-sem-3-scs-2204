object question {
    def filterPrimeNumbers(numbers: List[Int]): List[Int] = {
        numbers.filter( (x: Int) => if (x <= 1) false else if (x == 2) true else !(2 until x).exists(i => x % i == 0) )
    }

    def main(args: Array[String]): Unit = {
        val num = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println(filterPrimeNumbers(num))
    }
}
