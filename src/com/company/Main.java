package com.company;


public class Main {

    public static void main(String[] args) {

        Book bok = new Book("Ola Norman", "Java 101", 250);
        Book bok2 = new Book("Java 102", "Mirdon Gashi", 350);
        Book bok3 = new Book("java", "mirdon", 500);


        Movie movie1 = new Movie("Armageddon", MovieGenre.ACTION, 350, 2019);
        Movie movie2 = new Movie("The world of Devs", MovieGenre.DOCUMENTARY, 500, 2020, "Charle cheene");
        Movie movie3 = new Movie("Sharkando", MovieGenre.DOCUMENTARY, 350, 2015, "Dunno");

        Book[] books = {bok, bok2, bok3};
        for (int i = 0; i < books.length; i++) {
            books[i].printBookDetails();
        }

        Movie[] moviesarray = {movie1, movie2, movie3};
        for (Movie movie : moviesarray) {
            movie.printMovieDetails();
        }
    }
}
