package com.pluralsight.finance;

public class Gold extends FixedAsset{

    // variables for weight
     private double weight;

     //add constructors

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    //add getters
    public double getWeight() {
        return weight;

    }
    // add get value
        @Override
        public double getValue() {
            return super.getValue();
        }
    }


