package com.company;

public class MovieWithDirector extends Movie {

    public MovieWithDirector(int productID, int price, String titel, MovieGenre genre, String director) throws Exception {
        super(productID, price, titel, genre, director);
        this.director = director;
    }

    @Override
    public void printDetails() {
        System.out.println("Director: " + director);
        super.printDetails();
    }
}
