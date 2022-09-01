public class Book {
    private String bookName;
    private String author;
    private long isbn;
    private double price;

    public Book() {
        bookName = null;
        author = null;
        isbn = 0;
        price = 0.0;
    }
    public Book(String bookName, String author, long isbn, double price) {
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
}
