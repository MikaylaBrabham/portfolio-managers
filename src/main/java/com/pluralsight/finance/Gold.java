package com.pluralsight.finance;

public class Gold implements IValuable{

     private double weight;
     private double

    //add constructor from fixed asset
    public Gold(String name, double marketValue, double value, double weigh) {
        super(name, marketValue, value);
        this.weigh = weigh;
    }

    // add getter
    public double getWeigh() {
        return weigh;
    }
    // add setter
    public void setWeigh(double weigh) {
      this.weigh = 1;
    }
    // add weigh
    @Override
    public double getMarketValue() {
        return 0.00;
    }

    // add jewelry
    public jewelry() {
        super();
        double jewelry = this.karat * getMarketValue();


    }

    // add value
    @Override
    public double getValue() {
        return super.getValue();
    }
}

