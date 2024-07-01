object question {
    def updateList(list: Array[String]): Array[String] = {
        (list.isEmpty) match {
            case true => Array()
            case false => {
                val top = list.head
                val remainder = list.tail
                // println(top)
                // println(remainder.mkString(", "))

                (top.length > 5) match {
                    case true => top +: updateList(remainder)
                    case false => updateList(remainder)
                }
            }
        }
    }

    def main(args: Array[String]): Unit = {
        val list = Array("Jake", "Laura", "Joy", "Cody", "Castillo", "Destiny")
        val newList = updateList(list)
        println("Old list : " + list.mkString(", "))
        println("New list : " + newList.mkString(", "))
    }
}