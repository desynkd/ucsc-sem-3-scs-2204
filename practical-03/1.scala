object question {
    def reverseString(str: String): String = (str.isEmpty) match {
        case true => ""
        case false => reverseString(str.tail) + str.head
    }

    def main(args: Array[String]): Unit = {
        println("Reverse of 'Hello' is " + reverseString("Hello"))
    }
}