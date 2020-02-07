package com.company;

public enum MovieGenre {
    DRAMA,
    ACTION,
    DOCUMENTARY,
    COMEDY,
    THRILLER,
}

class Movie extends Product {

    protected String director;
    private final String titel;
    private final MovieGenre genre;

    public Movie(int productID, int price, String titel, MovieGenre genre, String director) throws IncorrectProductIdException {
        super(productID, price);
        this.titel = titel;
        this.genre = genre;

    }


    public String toString() {
        return this.genre + "\n" + this.titel + "\n";
    }

    @Override
    public void printDetails() {

        System.out.println("Titel: " + this.titel);
        System.out.println("Genre: " + this.genre);
        System.out.println("Pris: " + this.price);
        System.out.println("ProductId : " + this.productID);
        System.out.println("______________________");
    }
}

