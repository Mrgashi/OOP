package com.company;

import java.lang.ref.SoftReference;

public class Main {

    public static void main(String[] args) {
        Book bok = new Book();
        bok.setBookAuthor("bastiansen");
        bok.setTitel("Java 101");
        bok.setPrice(250);
        printBookDetails(bok);

        Book bok2 = new Book();
        bok2.setTitel("Java 102");
        bok2.setPrice(350);
        bok2.setBookAuthor("Mirdon Gashi");
        printBookDetails(bok2);

        Movie movie1 = new Movie();
        movie1.titel = "Armageddon";
        movie1.price = 350;
        movie1.genre = MovieGenre.ACTION;
        printMovieDetails(movie1);

        Movie movie2 = new Movie();
        movie2.genre = MovieGenre.DOCUMENTARYS;
        movie2.price = 5000;
        movie2.titel = "The world of devs";
        printMovieDetails(movie2);

        Book[] books = {bok, bok2};
        for (int i = 0; i < books.length; i++) {
            printBookDetails(books[i]);
        }

        Movie[] moviesarray = {movie1, movie2};
        for (Movie movie : moviesarray) {
            printMovieDetails(movie);
        }

    }


    public static void printBookDetails(Book book) {

        System.out.println("Pris: " + book.price);
        System.out.println("Author: " + book.author);
        System.out.println("Titel: " + book.titel);
        System.out.println("______________________");

    }

    public static void printMovieDetails(Movie movie) {

        System.out.println("Pris: " + movie.price);
        System.out.println("Genre: " + movie.genre);
        System.out.println("Titel: " + movie.titel);
        System.out.println("______________________");
    }
}
