object question {
    def fibonacci(n: Int): Int = {
        (n) match {
            case 0 => 0
            case 1 => 1
            case _ => fibonacci(n - 1) + fibonacci(n - 2)
        }
    }


    def printFibonacci(n: Int): Unit = {
        (n > 1) match {
            case true => {
                printFibonacci(n-1)
                print(fibonacci(n) + " ")
            }
            case false => print("0 1 ")
        }
    }

    
    def main(args: Array[String]): Unit = {
        printFibonacci(10)
    }
}