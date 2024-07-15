import scala.io.StdIn.readLine

object question {
    case class Book(title: String, author: String, isbn: String)

    def addBook(list: List[Book], title: String, author: String, isbn: String): List[Book] = {
        val newBook = Book(title, author, isbn)
        list :+ newBook
    }

    def removeBook(list: List[Book], isbn: String): List[Book] = {
        var tempList: List[Book] = List()
        (list.isEmpty) match {
            case true => {
                println("Book '" + isbn + "' not Found")
            }
            case false => {
                (list.head.isbn == isbn) match {
                    case true => {
                        println("Book '" + isbn + "' has been removed")
                        tempList = tempList ++ list.tail
                    }
                    case false => {
                        tempList = tempList :+ list.head
                        tempList = tempList ++ removeBook(list.tail, isbn)
                    }
                }
            }
        }

        tempList
    }

    def findBook(list: List[Book], isbn: String): Unit = {
        (list.isEmpty) match {
            case true => {
                println("Book '" + isbn + "' is not Found")
            }
            case false => {
                (list.head.isbn == isbn) match {
                    case true => println("Book '" + isbn + "' is in Library")
                    case false => findBook(list.tail, isbn)
                }
            }
        }
    }

    def listBook(list: List[Book], author: String): Unit = {
        (list.isEmpty) match {
            case true => {
                println("End of List")
            }
            case false => {
                (list.head.author == author) match {
                    case true => println("ISBN : " + list.head.isbn + " | Title : " + list.head.title)
                    case false => 
                }
                listBook(list.tail, author)
            }
        }
    }


    def printList(list: List[Book]): Unit = {
        (list.isEmpty) match {
            case true => 
            case false => {
                println("ISBN : " + list.head.isbn + " | Title : " + list.head.title + " | Author : " + list.head.author)
                printList(list.tail)
            }
        }
    }

    def main(args: Array[String]): Unit = {
        var libraryList: List[Book] = List();
        libraryList = addBook(libraryList, "Going Solo", "Roald Dhal", "978-0142413838");
        libraryList = addBook(libraryList, "Fourth Wing", "Rebecca Yours", "978-1649374042");
        libraryList = addBook(libraryList, "Onyx Storm", "Rebecca Yours", "978-1649374189");
        libraryList = addBook(libraryList, "To Kill a Mockingbird", "Harper Lee", "978-0060935467")
        libraryList = addBook(libraryList, "1984", "George Orwell", "978-0451524935")
        libraryList = addBook(libraryList, "The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565")
        libraryList = addBook(libraryList, "Pride and Prejudice", "Jane Austen", "978-1503290563")
        libraryList = addBook(libraryList, "The Catcher in the Rye", "J.D. Salinger", "978-0316769488")
        libraryList = addBook(libraryList, "The Hobbit", "J.R.R. Tolkien", "978-0547928227")
        libraryList = addBook(libraryList, "Fahrenheit 451", "Ray Bradbury", "978-1451673319")
        libraryList = addBook(libraryList, "The Book Thief", "Markus Zusak", "978-0375842207")
        libraryList = addBook(libraryList, "Moby Dick", "Herman Melville", "978-1503280786")


        println("---LIBRARY LIST---");
        printList(libraryList);
        println("");

        findBook(libraryList, "978-1451673319");
        libraryList = removeBook(libraryList, "978-1451673319");

        println("---LIBRARY LIST---");
        printList(libraryList);
        println("");

        findBook(libraryList, "978-1451673319");
        println("---LIBRARY LIST---");
        printList(libraryList);
        println("");

        var author: String = "Rebecca Yours";
        println("---Listing Books By '" + author + "'---");
        listBook(libraryList, author);
        println("");
    }
}