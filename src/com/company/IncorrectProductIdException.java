package com.company;

public class IncorrectProductIdException extends Exception {

    public Long incorrectNumber;

    public IncorrectProductIdException(Long incorrectNumber) {
    this.incorrectNumber = incorrectNumber;
    }
}