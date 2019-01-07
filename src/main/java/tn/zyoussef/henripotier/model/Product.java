package tn.zyoussef.henripotier.model;

public class Product {
    private String isbn;
    private int quantity;

    public Product() {
    }

    public Product(String isbn, int quantity) {
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
