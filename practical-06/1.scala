object question {
    case class Item(name: String, quantity: Int, price: Float)


    def main(args: Array[String]): Unit = {
        var inventory1 = Map(
            "1AA" -> Item("Vaporeon", 10, 0.59),
            "2BB" -> Item("Jolteon", 15, 0.69),
            "3CC" -> Item("Flareon", 5, 0.79),
            "4DD" -> Item("Espeon", 20, 0.89),
            "5EE" -> Item("Umbreon", 8, 0.99)
            )

        val inventory2 = Map(
            "6FF" -> Item("Leafeon", 12, 1.09),
            "7GG" -> Item("Glaceon", 18, 1.19),
            "8HH" -> Item("Sylveon", 25, 1.29),
            "2BB" -> Item("Jolteon", 10, 0.75),  
            "9II" -> Item("Eevee", 30, 0.49)
            )
            
        println("INVENTORY 1 ---")
        printProductNames(inventory1, inventory1.keys.toList)
        println("")

        println("TOTAL VALUE OF INVENTORY 1 ---")
        println(calculateTotalValue(inventory1, inventory1.keys.toList))
        println("")

        println("INVENTORY 1 STATUS ---")
        println(isEmpty(inventory1))
        println("")

        // merge 1 and 2
        val inventory3 = mergeInventory(inventory1, inventory2, inventory2.keys.toList)
        println("INVENTORY 3 ---")
        printProductNames(inventory3, inventory3.keys.toList)
        println("")

        val product = "1AA"
        println("SEARCH " + product + " IN INVENTORY 1 ---")
        printProduct(inventory1, product)
    }

    def printProductNames(inv: Map[String, Item], keys: List[String]): Unit = {
        keys match {
            case Nil =>
            case head :: tail => {
                println(inv(head).name)
                printProductNames(inv, tail)
            }
        }
    }

    def calculateTotalValue(inv: Map[String, Item], keys: List[String]): Float = {
        keys match {
            case Nil => 0.0
            case head :: tail => {
                calculateTotalValue(inv, tail) + inv(head).price
            }
        }
    }

    def isEmpty(inv: Map[String, Item]): String = {
        inv.isEmpty match {
            case true => "Inventory is Empty!"
            case false => "Inventory is not Empty!"
        }
    }

    def mergeInventory(inv1: Map[String, Item], inv2: Map[String, Item], keys2: List[String]): Map[String, Item] = {
        keys2 match {
            case Nil => inv1
            case head :: tail => {
                if (inv1.contains(head)) {
                    val entry = Item(inv2(head).name, inv2(head).quantity + inv1(head).quantity, Math.max(inv2(head).price , inv1(head).price))
                    mergeInventory(inv1, inv2, tail) + (head -> entry)
                } else {
                    val entry = Item(inv2(head).name, inv2(head).quantity, inv2(head).price)
                    mergeInventory(inv1, inv2, tail) + (head -> entry)
                }
            }
        }
    }

    def printProduct(inv: Map[String, Item], product: String): Unit = {
        inv.contains(product) match {
            case true => {
                println("Product " + product + " found!")
                println("Name : " + inv(product).name)
                println("Quantity : " + inv(product).quantity)
                println("Price : " + inv(product).price)
            }
            case false => {
                println("Product " + product + " not found!")
            }
        }
    }
}