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
    public void add(IValuable valuable){

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

    //add getleastvaluable

}
