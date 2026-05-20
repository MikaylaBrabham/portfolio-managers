package com.pluralsight.finance;

public class CreditCard implements IValuable {
    //add derived strings

    private String name;
    private int accountNumber;
    private double balance;

    // add constructor

    public CreditCard(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    //add getter

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    //add derived methods
    public void charge(double amount){
        this.balance -= amount;
    }

    public void pay(double amount){
        this.balance += amount;
    }

// add to string
    @Override
    public String toString() {
        return "CreditCard{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
    //add value
    @Override
    public double getValue() {
        return this.balance;
    }
}
