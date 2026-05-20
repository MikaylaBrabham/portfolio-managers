package com.pluralsight.finance;

public class House extends FixedAsset{

    //add variables
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    // add constructors
    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }
    // get value
    @Override
    public double getValue() {
        return super.getValue();
    }
}
