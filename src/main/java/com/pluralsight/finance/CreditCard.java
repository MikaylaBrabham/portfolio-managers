package com.pluralsight.finance;

public class CreditCard implements IValuable {
    //add derived strings

    private String name;
    private String accountNumber;
    private double balance;

    // add constructor

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    //add getter

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //add value
    @Override
    public double getValue() {
        return 0;
    }

    //add derived methods

}
