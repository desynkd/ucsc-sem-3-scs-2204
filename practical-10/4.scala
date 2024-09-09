object question {
    class Account(val id: String, var balance: Double) {
        def deposit(amount: Double): Unit = {
            require(amount > 0, "Deposit amount must be positive")
            balance += amount
        }

        def withdraw(amount: Double): Unit = {
            require(amount > 0, "Withdrawal amount must be positive")
            // require(balance >= amount, "Withdraw failed(id: " + id + "): Insufficient funds")
            balance -= amount
        }

        def transfer(amount: Double, toAccount: Account): Unit = {
            require(amount > 0, "Transfer amount must be positive")
            require(balance >= amount, "Transfer failed(id: " + id + "): Insufficient funds")
            withdraw(amount)
            toAccount.deposit(amount)
        }

        def print = "Account(" + id + ", balance: " + balance + ")"
    }

    class Bank(val accounts: List[Account]) {
        def accountsWithNegativeBalance: List[Account] = {
            accounts.filter(_.balance < 0)
        }

        def totalBalance: Double = {
            accounts.map(_.balance).sum
        }

        def applyInterest(): Unit = {
            accounts.foreach { account =>
            if (account.balance > 0) {
                account.deposit(account.balance * 0.05)
            } else if (account.balance < 0) {
                account.withdraw(account.balance.abs * 0.1)
            }
            }
        }
    }


    def main(args: Array[String]): Unit = {
        val bank = new Bank(List(
            new Account("1", 1000),
            new Account("2", -500),
            new Account("3", 200)
        ))

        println("Accounts with Negative Balance")
        bank.accountsWithNegativeBalance.foreach { account => println(account.print) }

        println("Total balance: " + bank.totalBalance)
        
        bank.applyInterest()

        println("Final Balances")
        bank.accounts.foreach {account => println(account.print)} 
    }
}