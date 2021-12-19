import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void autoGenerateLibrary(){
        books.add(new Book(books.size() + 1, "Clear Code", "Robert Martin", "Piter", 2021, 456, 15, "Paperback"));
        books.add(new Book(books.size() + 1, "Harry Potter", "Joan Rouling", "Clean East", 2012, 956, 21, "Hardcover"));
        books.add(new Book(books.size() + 1, "Harry Potter and Roll", "Joan Rouling", "Clean East", 2013, 256, 26, "Hardcover"));
        books.add(new Book(books.size() + 1, "War and Peas", "Lev Tolstoy", "Clean West", 1867, 1956, 32, "Hardcover"));
        books.add(new Book(books.size() + 1, "Soft and Dry", "Yan Hchosniy", "Drogush", 1999, 123, 3, "Hardcover"));
        books.add(new Book(books.size() + 1, "Marmoks", "Kirill Zabrodin", "Beatlist", 1222, 3211, 129, "Paperback"));
    }

    public void createNewBooks() throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        Book book = new Book();
        book.setBookId(books.size()+1);
        System.out.println("Enter name of book: ");
        book.setBookName(buff.readLine());
        System.out.println("Enter authors of book: ");
        book.setBookAuthor(buff.readLine());
        System.out.println("Enter book publisher: ");
        book.setBookPublisher(buff.readLine());
        System.out.println("Enter year of publishing: ");
        book.setBookYearOfPublishing(Integer.parseInt(buff.readLine()));
        System.out.println("Enter numbers of sides: ");
        book.setBookNumberOfSides(Integer.parseInt(buff.readLine()));
        System.out.println("Enter book cost: ");
        book.setBookCost(Integer.parseInt(buff.readLine()));
        System.out.println("Enter book binding type: ");
        book.setBookBindingType(buff.readLine());
        books.add(book);
    }

    public void searchAuthorsBooks() throws IOException{
        Boolean authorNotFound  = true;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("List of available authors");
        for (Book index : books)
            System.out.print(index.getBookAuthor() + ", ");
        System.out.println("Enter author for search: ");
        String authorForSearch = buff.readLine();
        for (Book index : books){
            if (index.getBookAuthor().equals(authorForSearch)){
                authorNotFound = false;
                System.out.println(index.toString());
            }
        }
        if (authorNotFound)
            System.out.println("Author not found!!!");
    }

    public void searchPublisherBooks () throws IOException {
        Boolean publisherNotFound  = true;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("List of available publisher");
        for (Book index : books)
            System.out.print(index.getBookPublisher() + ", ");
        System.out.println("Enter publisher for search: ");
        String publisherForSearch = buff.readLine();
        for (Book index : books){
            if (index.getBookPublisher().equals(publisherForSearch)){
                publisherNotFound = false;
                System.out.println(index.toString());
            }
        }
        if (publisherNotFound)
            System.out.println("Publisher not found!!!");
    }

    public void searchBooksAfterYearPublishing() throws IOException {
        Boolean yearNotFound  = true;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter year for search: ");
        int yearForSearch = Integer.parseInt(buff.readLine());
        for (Book index : books){
            if (index.getBookYearOfPublishing() > yearForSearch){
                yearNotFound = false;
                System.out.println(index.toString());
            }
        }
        if (yearNotFound)
            System.out.println("Year not found!!!");
    }

    public static void main(String[] args) throws IOException {
        /* 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
    a) список книг заданного автора;
    b) список книг, выпущенных заданным издательством;
    c) список книг, выпущенных после заданного года.*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int choise = 4;
        boolean choiceGenerateRandomLibrary = false;

        Library myLibrary = new Library();


        while (true) {
            System.out.println("\nChoose operation: \n" +
                    "1 - List of books by a given author \n" +
                    "2 - List of books published by a given publisher \n" +
                    "3 - List of books released after a given year \n" +
                    "4 - Add new book in library \n" +
                    "5 - Generate a random library \n" +
                    "6 - Exit");
            choise = Integer.parseInt(bufferedReader.readLine());
            switch (choise) {
                case (1):
                    myLibrary.searchAuthorsBooks();
                    break;
                case (2):
                    myLibrary.searchPublisherBooks();
                    break;
                case (3):
                    myLibrary.searchBooksAfterYearPublishing();
                    break;
                case (4):
                    myLibrary.createNewBooks();
                    break;
                case (5):
                    if (!choiceGenerateRandomLibrary){
                        choiceGenerateRandomLibrary = true;
                        myLibrary.autoGenerateLibrary();
                    }
                    else
                        System.out.println("Cannot be re-generated!!!");
                    break;
                case (6):
                    return;
                default:
                    System.out.println("Incorrect number, please enter number (1-3)");
                    break;
            }
        }
    }
}