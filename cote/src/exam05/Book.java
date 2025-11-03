package exam05;

public class Book {
    private String title;
    private String author;
    private int price;
    private String isbn;

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice() {
        return price;
    }
    public String getIsbn() {
        return isbn;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Book(String title, String author, String isbn, int price){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
}
