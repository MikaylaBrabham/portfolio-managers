package com.pluralsight.finance;

public class Gold extends FixedAsset {

        //add karat
    private double karat;

    //add constructor from fixed asset
    public Gold(String name, double marketValue, double value, double karat) {
        super(name, marketValue, value);
        this.karat = karat;
    }

    // add getter
    public double getKarat() {
        return karat;
    }
    // add setter
    public void setKarat(double karat) {
        this.karat = 3000;
    }
    // add karat



    // add jewelry
    public jewelry() {


    }

    // add value
    @Override
    public double getValue() {
        return super.getValue();
    }
}

