package com.pluralsight.finance;

public abstract class FixedAsset implements IValuable {

    //add in given variables
    private String name;
    private double marketValue;

    //add constructors

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    //add getters only

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    //add getvalue
    @Override
    public double getValue() {
        return marketValue;
    }

    //add derived asset
    @Override
    public String toString() {
        return this.name + "$" + this.marketValue;

    }


}
