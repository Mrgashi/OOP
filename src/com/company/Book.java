package com.company;

public class Book {
    private String titel;
    private String author;
    private int price;


    public void setBookAuthor(String authorName) {
        this.author = authorName;
    }

    public String getBookAuthor() {
        return author;
    }

    public void setTitel(String titelName) {
        this.titel = titelName;
    }

    public String getTitel() {
        return titel;
    }

    public void setPrice(int priceOut) {
        this.price = priceOut;
    }

    public int getPrice() {
        return price;
    }

    public void printBookDetails() {

        System.out.println("Pris: " + this.price);
        System.out.println("Author: " + this.author);
        System.out.println("Titel: " + this.titel);
        System.out.println("______________________");

    }
}
