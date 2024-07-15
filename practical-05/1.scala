import scala.io.StdIn.readLine

object question {
    def main(args: Array[String]): Unit = {
        var list: List[String] = getProductList();
        println("PRODUCT LIST");
        printProductList(list);
        println("NUMBER OF PRODUCTS : " + getTotalProducts(list));
    }

    def getProductList(): List[String] = {
        var productList: List[String] = List()
        var input: String = readLine("Enter a product name: ")
    
        (input == "done") match {
            case true => productList
            case false => {
                productList = productList :+ input
                productList ++ getProductList()}
        }
    }

    def printProductList(list: List[String]): Unit = {
        (list.isEmpty) match {
            case true => 
            case false => {
                println(list.head)
                printProductList(list.tail)
                }
        }
    }

    def getTotalProducts(list: List[String]): Int = {
        (list.isEmpty) match {
            case true => 0
            case false => 1 + getTotalProducts(list.tail)
        }
    }
}