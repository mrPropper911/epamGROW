public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPublisher;
    private int bookYearOfPublishing;
    private int bookNumberOfSides;
    private double bookCost;
    private String bookBindingType;

    public Book() {
        this.bookId = 0;
        this.bookName = "";
        this.bookAuthor = "";
        this.bookPublisher = "";
        this.bookYearOfPublishing = 0;
        this.bookNumberOfSides = 0;
        this.bookCost = 0;
        this.bookBindingType = "";
    }

    public Book(int bookId, String bookName, String bookAuthor, String bookPublisher, int bookYearOfPublishing,
                int bookNumberOfSides, double bookCost, String bookBindingType) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.bookYearOfPublishing = bookYearOfPublishing;
        this.bookNumberOfSides = bookNumberOfSides;
        this.bookCost = bookCost;
        this.bookBindingType = bookBindingType;
    }

    @Override
    public String toString() {
        return "Book: " +
                " Id = " + bookId +
                ", Name = '" + bookName + '\'' +
                ", Author = '" + bookAuthor + '\'' +
                ", Publisher = '" + bookPublisher + '\'' +
                ", YearOfPublishing = " + bookYearOfPublishing +
                ", NumberOfSides = " + bookNumberOfSides +
                ", Cost = " + bookCost +
                ", BindingType = '" + bookBindingType + '\'';
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public void setBookYearOfPublishing(int bookYearOfPublishing) {
        this.bookYearOfPublishing = bookYearOfPublishing;
    }

    public void setBookNumberOfSides(int bookNumberOfSides) {
        if (bookNumberOfSides > 0)
            this.bookNumberOfSides = bookNumberOfSides;
        else
            System.out.println("The number of pages must be more than 1!!!");
    }

    public void setBookCost(double bookCost) {
        if (bookCost > 0)
            this.bookCost = bookCost;
        else
            System.out.println("The price cannot be negative!!!");
    }

    public void setBookBindingType(String bookBindingType) {
        this.bookBindingType = bookBindingType;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName(String s) {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public int getBookYearOfPublishing() {
        return bookYearOfPublishing;
    }

    public int getBookNumberOfSides() {
        return bookNumberOfSides;
    }

    public double getBookCost() {
        return bookCost;
    }

    public String getBookBindingType() {
        return bookBindingType;
    }
}
