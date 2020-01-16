package com.company;

public enum MovieGenre {
    DRAMA,
    ACTION,
    DOCUMENTARY,
    COMEDY,
}

class Movie {
    private String titel;
    private MovieGenre genre;
    private int price;
    private int year;
    private String director;


    Movie(String titel, MovieGenre genre, int price, int year) {
        this.titel = titel;
        this.genre = genre;
        this.price = price;
        this.year = year;
    }

    Movie(String titel, MovieGenre genre, int price, int year, String director) {
        this(titel, genre, price, year);
        this.director = director;
    }


    public void printMovieDetails() {

        System.out.println("Titel: " + this.titel);
        System.out.println("Genre: " + this.genre);
        if (director != null) {
            System.out.println("Director: " + this.director);
        }
        System.out.println("Pris: " + this.price);
        if (this.year == 0) {
            System.out.println("No release data");
        } else {
            System.out.println("Release year: " + this.year);
        }
        System.out.println("______________________");
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

