package com.pluralsight.finance;

public class Portfolio extends FixedAsset{

    //add variables
    private String owner;


    //add constructors
    public Portfolio(String name, double marketValue, String owner) {
        super(name, marketValue);
        this.owner = owner;
    }
}
