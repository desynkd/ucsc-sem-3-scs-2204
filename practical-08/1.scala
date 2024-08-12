import scala.io.StdIn.readLine

object question {
    def encrypt(): Unit = {
        val plaintext: Array[Char] = readLine("Enter Plaintext : ").toCharArray
        val shift: Int = readLine("Enter Shift : ").toInt
        val ciphertext = new Array[Char](plaintext.length)

        for (i <- plaintext.indices) {
            ciphertext(i) = (plaintext(i) + shift).toChar
        }

        val ciphertextString = new String(ciphertext)
        println("Ciphertext: " + ciphertextString)
    }

    def decrypt(): Unit = {
        val ciphertext: Array[Char] = readLine("Enter Ciphertext : ").toCharArray
        val shift: Int = readLine("Enter Shift : ").toInt
        val plaintext = new Array[Char](ciphertext.length)

        for (i <- ciphertext.indices) {
            plaintext(i) = (ciphertext(i) - shift).toChar
        }

        val plaintextString = new String(plaintext)
        println("Plaintext: " + plaintextString)
    }
    
    def main(args: Array[String]): Unit = {
        println("Enter input ( e-Encrypt | d-Decrypt | q-Quit):")
        val input = readLine()

        input match {
            case "e" => { encrypt(); main(args) }
            case "d" => { decrypt(); main(args) }
            case "q" => println("Exiting Program")
            case _ => { println("Invalid Argument"); main(args) }
        }
    }
}