package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    //add variables
    private String name;
    private String owner;
    private List<IValuable> valuables;

    //add constructors
    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();
    }

    //add asset valuable
    public void add(IValuable valuable) {

        valuables.add(valuable);
    }

    // add get value
    public double getValue() {
        double total = 0;
        for (IValuable valuable : valuables) {
            total += valuable.getValue();
        }
        return total;
    }

    //add getmostvaluable
    public double getMostValuable() {
        //make high varaible starts index 0
        IValuable high = valuables.get(0);

        //create for loop to get highest from the Ivaluables
        for (IValuable valuable : valuables) {
            if (valuable.getValue() > high.getValue()) {
                high = valuable;
            }
        }
        return high.getValue();
    }

    //add getleastvaluable
    public double getLeastValuable() {
        //make least variable starts index 0
        IValuable low = valuables.get(0);

        //create for loop to get lowest from the Ivaluables
        for (IValuable valuable : valuables) {
            if (valuable.getValue() < low.getValue()) {
                low = valuable;
            }
        }
        return low.getValue();
    }
}
