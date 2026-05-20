package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    //added karat
    private double karat;

    //added constructors
    public Jewelry(String name, double marketValue, double value, double karat) {
        super(name, marketValue, value);
        this.karat = karat;
    }
    //added karat getter
    public double getKarat() {
        return karat;
    }
}
