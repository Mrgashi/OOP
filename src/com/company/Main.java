package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {

        List<Product> allProducts = new ArrayList<>();

        Book bok = new Book(12354, 250, "armageddon", "Mirdon");
        Book bok2 = new Book(12354, 250, "armageddon", "Heihopp");
        Book bok3 = new Book(12354, 250, "armageddon", "HoppHei");
        Book bok5 = new Book(-321, 240,"armageddon", "exception");
        ChildrenBook bok4 = new ChildrenBook(12354, 250, "Langstrømpe", "Astridlingren", "Tillat fra 4år");

        allProducts.add(bok);
        allProducts.add(bok2);
        allProducts.add(bok3);
        allProducts.add(bok4);
        allProducts.add(bok5);

        for (int i = 0; i < allProducts.size(); i++) {
            allProducts.get(i).printDetails();
        }

        Movie movie1 = new MovieWithDirector(-400491, 350, "Armageddon", MovieGenre.ACTION, "Charle Cheene");
        Movie movie2 = new MovieWithDirector(101024, 500, "The world of devs", MovieGenre.DOCUMENTARY, "Mirdon Gashi");
        Movie movie3 = new MovieWithDirector(-2010269, 350, "SharkNado", MovieGenre.ACTION, "Loka");
        Movie movie4 = new MovieWithDirector(007, 1500, "Hardcoded", MovieGenre.COMEDY, "Siri Svanemy");

        allProducts.add(movie1);
        allProducts.add(movie2);
        allProducts.add(movie3);
        allProducts.add(movie4);
       /* allProducts.add(movie5);
*/
        for (Product m : allProducts) {
            m.printDetails();
        }
    }
}
