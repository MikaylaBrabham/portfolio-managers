package com.pluralsight.finance;

public class Gold extends FixedAsset {

    //add constructor from fixed asset
    public Gold(String name, double marketValue, double value) {
        super(name, marketValue, value);

    }
    //add marketvalue and override as karat
    public double karat(double marketValue){
        return marketValue;
    }

    // add jewelry
    public void jewelry(){

    }



    // add value
    @Override
    public double getValue() {
        return super.getValue();
    }
}

