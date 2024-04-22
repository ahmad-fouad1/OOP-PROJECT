package project1;

public class BookProduct extends Product {

    private String author;
    private String publisher;

    public BookProduct(String name,int productId , float price ,String author,String publisher) {
        super(name, productId, price);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
