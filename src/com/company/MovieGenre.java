package com.company;

public enum MovieGenre {
    DRAMA,
    ACTION,
    DOCUMENTARYS,
    COMEDY,
}

class Movie {
    private String titel;
    private MovieGenre genre;
    private int price;
    private int year;


    public void setTitel (String titel) {
        this.titel = titel;
    }
    public String getTitel () {
        return titel;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year){
        this.year = year;
        if (this.year == 0) {
            System.out.println("No release data");
        }
    }
    public void printMovieDetails() {

        System.out.println("Pris: " + this.price);
        System.out.println("Genre: " + this.genre);
        System.out.println("Titel: " + this.titel);
        if (this.year == 0){
            System.out.println("No release data");
        } else {
            System.out.println("Release year: " + this.year);
        }
        System.out.println("______________________");
    }

}

