package com.company;

import java.util.List;

public abstract class Product {

    int productID;
    int price;

    public Product(int productID, int price) {
        this.productID = productID;
        this.price = price;

        try {
            if (productID  < 0) {
                throw new IncorrectProductIdException((long)productID);
            }
        } catch (IncorrectProductIdException e) {
            System.out.println(e.incorrectNumber + " HEEEEI! DETTE GÅR IKKE");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int findMyProductById(List<Product> products, int productID) {
        for (Product m : products) {
            if (m.productID != productID) {
                System.out.println("Could not find product with ID " + productID);
            } else {
                System.out.println("Results: " + productID);
            }
        }
        return productID;
    }

    public void printDetails() {

    }
}
