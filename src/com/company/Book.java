package com.company;

public class Book {
    private String titel;
    private String author;
    private int price;


    Book(String titel, String author, int price) {
        this.titel = titel;
        this.author = author;
        this.price = price;
    }


    public void printBookDetails() {

        System.out.println("Titel: " + this.titel);
        System.out.println("Author: " + this.author);
        System.out.println("Pris: " + this.price);
        System.out.println("______________________");

    }
}
