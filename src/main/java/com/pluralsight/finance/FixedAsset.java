package com.pluralsight.finance;

public abstract class FixedAsset implements IValuable {

    //add in given variables
    private String name;
    private double MarketValue;
    private double value;

    //add constructors

    public FixedAsset(String name, double marketValue, double value) {
        this.name = name;
        MarketValue = marketValue;
        this.value = value;
    }


    //add getters only

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return MarketValue;
    }

    public double getValue() {
        return value;
    }

    //add derived asset
    public String toString() {
        return this.name + "$" + this.value;

    }


}
