package com.company;

public class Book extends Product {
    protected String titel;
    private String author;

    public Book(int productID, int price, String titel, String author) throws Exception {
        super(productID, price);
        this.titel = titel;
        this.author = author;
    }

    @Override
    public String toString() {
        return this.titel + " \n" + this.author + " \n" + this.price;
    }

    @Override
    public void printDetails() {

        System.out.println("Titel: " + this.titel);
        System.out.println("Author: " + this.author);
        System.out.println("Pris: " + this.price);
        System.out.println("______________________");

    }
}
