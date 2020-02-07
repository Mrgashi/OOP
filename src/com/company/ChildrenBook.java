package com.company;

public class ChildrenBook extends Book {

    private String recommendedAgeInfo;

    public ChildrenBook(int productID, int price, String title, String author, String recommendedAgeInfo) throws Exception{
        super(productID, price, title, author);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public void printDetails() {
        System.out.println("Recommended age: " + recommendedAgeInfo);
        super.printDetails();
    }
}
