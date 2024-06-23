object question {
    def costPerShow(attendees: Int): Double = {
        500.0 + ( 3.0 * attendees )
    }

    def getNetProfit(price: Double, attendees: Int): Double = {
        (price * attendees) - costPerShow(attendees)
    }

    def calculateAttendees(price: Double): Int = {
        (120 - ( (price - 15.0) * 4 )).toInt
    }

    def main(args: Array[String]): Unit = {

        // Change attendees as needed
        var price = 10.0
        var atd = calculateAttendees(price)
        printf("Price = %.2f, Attendees = %d\n", price, atd)
        println("Net Profit = " + getNetProfit(price, atd))
    }
}