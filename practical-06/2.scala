import scala.io.StdIn.readLine

object question {
    def main(args: Array[String]): Unit = {
        val student = getStudentInfo()
        
        println("\nDISPLAY STUDENT ---")
        printStudentRecord(student)
    }

    def getStudentInfo(): (String, Int, Int, Double, Char) = {
        val name: String = readLine("Enter Student Name: ")
        val mark: Int = readLine("Enter Marks: ").toInt
        val total: Int = readLine("Enter Total Possible Marks: ").toInt
        val validate = valideInput(name, mark, total)
        
        (validate._1) match {
            case true => {
                println("Error: " + validate._2.getOrElse(""))
                getStudentInfo()
            }
            case false => {
                val percentage: Double = mark.toDouble / total.toDouble
                val grade: Char = assignGrade(percentage)
                (name, mark, total, percentage, grade)
            }
        }
    }

    def valideInput(name: String, mark: Int, total: Int): (Boolean, Option[String]) = {
        if (name.isEmpty || mark < 0 || total < 0) {
            (true, Some("Invalid Input"))
        } else if (mark > total){
            (true, Some("Marks Exceed Total Marks"))
        } else {
            (false, None)
        }
    }

    def assignGrade(percentage: Double): Char = {
        (percentage) match {
            case x if x >= 0.9 => 'A'
            case x if x >= 0.75 => 'B'
            case x if x >= 0.5 => 'C'
            case _ => 'D'
        }
    }

    def printStudentRecord(student: (String, Int, Int, Double, Char)): Unit = {
        println("Student Name: " + student._1)
        println("Student Marks: " + student._2)
        println("Total Possible Marks: " + student._3)
        println("Marks Percentage: " + student._4)
        println("Student Grade: " + student._5)
    }
}