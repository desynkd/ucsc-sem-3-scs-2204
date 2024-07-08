object question {
    def toUpper(str: String): String = {
        (str.isEmpty) match {
            case true => ""
            case false => {
                if (str(0) >= 'a' && str(0) <= 'z') {
                    (str(0) - 32).toChar + toUpper(str.tail)
                } else {
                    str(0) + toUpper(str.tail)
                }
            }
        }
    }

    def toLower(str: String): String = {
        (str.isEmpty) match {
            case true => ""
            case false => {
                if (str(0) >= 'A' && str(0) <= 'Z') {
                    (str(0) + 32).toChar + toLower(str.tail)
                } else {
                    str(0) + toLower(str.tail)
                }
            }
        }
    }

    def firstTwoUpper(str: String): String = {
        toUpper(str(0).toString) + toUpper(str(1).toString) + str.substring(2)
    }

    def firstToUpper(str:String): String = {
        toUpper(str(0).toString) + str.tail
    }

    def lastToUpper(str:String): String = {
        (str.tail.isEmpty) match {
            case true => toUpper(str(0).toString)
            case false => str.head + lastToUpper(str.tail)
        }
    }

    def formatNames(name: String, function: String => String): String = {
        function(name)
    }

    
    def main(args: Array[String]): Unit = {
        println(formatNames("Benny", toUpper))
        println(formatNames("Niroshan", firstTwoUpper))
        println(formatNames("Saman", toLower))
        println(firstToUpper(lastToUpper("Kumara")))
    }
}