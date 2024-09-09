import scala.io.StdIn.readLine

object question{
    def countLetterOccurrences(words: List[String]): Int = {
        words.map(_.length).reduce(_ + _)
    }

    def getWords(count: Int): List[String] = {
          if (count <= 0) {
            List() 
        } else {
            val word = readLine("Enter word: ")
            word :: getWords(count - 1) 
        }
    }

    def main(args: Array[String]): Unit = {
        val count = readLine("No of words to be given: ").toInt
        val words = getWords(count)
        val totalCount = countLetterOccurrences(words)
        println("Total count of letter occurrences: " + totalCount)
    }
}