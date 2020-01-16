package com.company;


public class Main {

    public static void main(String[] args) {
        Book bok = new Book();
        bok.setBookAuthor("Ola Norman");
        bok.setTitel("Java 101");
        bok.setPrice(250);
        bok.printBookDetails();

        Book bok2 = new Book();
        bok2.setTitel("Java 102");
        bok2.setPrice(350);
        bok2.setBookAuthor("Mirdon Gashi");
        bok2.printBookDetails();

        Movie movie1 = new Movie();
        movie1.setTitel("Armageddon");
        movie1.setPrice(350);
        movie1.setGenre(MovieGenre.ACTION);
        movie1.setYear(2020);
        movie1.printMovieDetails();

        Movie movie2 = new Movie();
        movie2.setGenre(MovieGenre.DOCUMENTARYS);
        movie2.setPrice(500);
        movie2.setTitel("The world of devs");
        movie2.printMovieDetails();

        Book[] books = {bok, bok2};
        for (int i = 0; i < books.length; i++) {
            books[i].printBookDetails();
        }

        Movie[] moviesarray = {movie1, movie2};
        for (Movie movie : moviesarray) {
            movie.printMovieDetails();
        }

    }
}
