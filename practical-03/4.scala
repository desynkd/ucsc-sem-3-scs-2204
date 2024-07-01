object question {
    def getEvenSum(list: Array[Int]): Int = {
        (list.isEmpty) match {
            case true => 0
            case false => {
                val top = list.head
                val remainder = list.tail

                (top % 2 == 0) match {
                    case true => top + getEvenSum(remainder)
                    case false => getEvenSum(remainder)
                }
            }
        }
    }

    def main(args: Array[String]): Unit = {
        val list = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val evenSum = getEvenSum(list)
        println("List of Int : " + list.mkString(", "))
        println("Even Sum : " + evenSum)
    }
}