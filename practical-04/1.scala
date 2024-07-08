object question {
    def displayInventory(item: Array[String], quant: Array[Int]): Any = {
        if (!item.isEmpty)
        {
            println("Item: " + item.head + " | Quantity: " + quant.head);
            displayInventory(item.tail, quant.tail);
        }
    }

    def restockItem(item: Array[String], quant: Array[Int], inpItem: String, inpQuant: Int): Any = {
        if (item.isEmpty)
        {
            println("Error : '" + inpItem + "' Item Not found in Inventory!");
        }
        else
        {
            if (inpItem == item.head)
            {
                quant(0) += inpQuant;
                println("Success : '" + inpItem + "' Item is restocked!");
            }
            else
            {
                restockItem(item.tail, quant.tail, inpItem, inpQuant);
            }
        }
    }

    def sellItem(item: Array[String], quant: Array[Int], inpItem: String, inpQuant: Int): Any = {
        if (item.isEmpty)
        {
            println("Error : '" + inpItem + "' Item Not found in Inventory!");
        }
        else
        {
            if (inpItem == item.head)
            {
                if (quant.head >= inpQuant)
                {
                    quant(0) -= inpQuant;
                    println("Success : '" + inpQuant + "' of '" + inpItem + "' Item sold!");
                }
                else
                {
                    println("Error : '" + inpItem + "' Item does not have enough quantity in Inventory!");
                }
            }
            else
            {
                sellItem(item.tail, quant.tail, inpItem, inpQuant);
            }
        }
    }

    def main(args: Array[String] ): Unit = {
        var item = Array("Soap", "Milk", "Rice", "Noodles", "Toothpaste");
        var quant = Array(10, 5, 6, 2, 7);

        println("1 : Print ALl Inventory");
        displayInventory(item, quant);
        println("");

        println("2.1 : Add 5 Noodles to Inventory");
        restockItem(item, quant, "Noodles", 5);
        println("");

        println("2.2 : Add 6 Coffee to Inventory");
        restockItem(item, quant, "Coffee", 6);
        println("");

        println("3.1 : Sell 3 Soap to Customer");
        sellItem(item, quant, "Soap", 3);
        println("");

        println("3.2 : Sell 8 Milk to Customer");
        sellItem(item, quant, "Milk", 8);
        println("");

        println("3.3 : Sell 3 Coffee to Customer");
        sellItem(item, quant, "Coffee", 3);
        println("");
    }
}