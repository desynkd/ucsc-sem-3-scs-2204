object question {
    def makeSquared(numbers: List[Int]): List[Int] = {
        numbers.map( (num: Int) => num * num )
    }

    def main(args: Array[String]): Unit = {
        val num = List(1, 2, 3, 4, 5)
        println(makeSquared(num))
    }
}
