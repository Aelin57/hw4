package com.company;

public class LimitExeption extends Exception{
    private double remainigAmount;

    public LimitExeption(String message, double remainigAmount){
        super(message);
        this.remainigAmount = remainigAmount;
    }

    public double getRemainigAmount() {
        return remainigAmount;
    }
}
