object calculateCost {
    def giveDiscount(price: Double, disc: Double): Double = {
        price * (1.0 - disc)
    }

    def shippingCost(copies: Double): Double = {
        if ( copies <= 50 ) {
            copies * 3.0
        }
        else {
            (50.0 * 3.0) + ( (copies - 50.0) * 0.75 )
        }
    }

    def baseCost(price:Double, copies: Double): Double = {
        price * copies
    }
    
    def main(args: Array[String]): Unit = {
        var price: Double = 24.95
        var copies: Double = 60
        var totalCost = giveDiscount(baseCost(price, copies), 0.4) + shippingCost(copies)

        printf("Total cost for %.2f copies of books of price %.2f = %.2f\n", copies, price, totalCost)
    
    }
}