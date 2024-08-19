object question {
    def main(args: Array[String]): Unit = {
        val toUpper: String => String = str => str.toUpperCase
        val toLower: String => String = str => str.toLowerCase
        val formatNames: (String, String => String) => String = (name, formatFunction) => formatFunction(name)

        println(formatNames("Benny", toUpper))            
        println(formatNames("Niroshan", str => str.take(2).toUpperCase + str.drop(2))) 
        println(formatNames("Saman", toLower))            
        println(formatNames("Kumara", str => str.take(1).toUpperCase + str.drop(1).init + str.takeRight(1).toUpperCase)) 
    }
}
