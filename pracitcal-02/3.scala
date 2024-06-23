object question {
    def getBaseSalary(normal: Double, ot: Double): Double = {
        (normal * 250.0) + (ot * 85.0) 
    }

    def afterTaxSalary(salary: Double): Double = {
        salary - (salary * 0.12)
    }

    def main(args: Array[String]): Unit = {
        println("Take Home Salary : " + afterTaxSalary(getBaseSalary(40, 30)))
    }
}