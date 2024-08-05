object question {
    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
        numbers.filter( (num: Int) => num % 2 == 0 )
    }

    def main(args: Array[String]): Unit = {
        val num = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println(filterEvenNumbers(num))
    }
}