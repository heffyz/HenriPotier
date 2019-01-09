package tn.zyoussef.henripotier.model;

import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private int price;
    private String cover;
    private List<String> synopsis ;

    public Book() {

    }

    public Book(String isbn, String title, int price, String cover, List<String> synposis) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.cover = cover;
        this.synopsis = synposis;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public List<String> getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(List<String> synopsis) {
        this.synopsis = synopsis;
    }
}
