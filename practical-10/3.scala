object question {
    class Account(val id: String, var balance: Double) {
        def deposit(amount: Double): Unit = {
            require(amount > 0, "Deposit amount must be positive")
            balance += amount
        }

        def withdraw(amount: Double): Unit = {
            require(amount > 0, "Withdrawal amount must be positive")
            require(balance >= amount, "Insufficient funds")
            balance -= amount
        }

        def transfer(amount: Double, toAccount: Account): Unit = {
            require(amount > 0, "Transfer amount must be positive")
            require(balance >= amount, "Insufficient funds")
            withdraw(amount)
            toAccount.deposit(amount)
        }

        def print = "Account(" + id + ", balance: " + balance + ")"
    }

    def main(args: Array[String]): Unit = {
        val account1 = new Account("1", 1000)
        val account2 = new Account("2", 500)
        account1.transfer(200, account2)
        println(account1.print)
        println(account2.print) 
    }
}