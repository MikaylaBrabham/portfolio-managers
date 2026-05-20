package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    //added karat
    private double karat;

    //added constructors

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }


    //added karat getter
    public double getKarat() {
        return karat;

    }
    // add value
        @Override
        public double getValue() {
            return super.getValue();
        }
    }
