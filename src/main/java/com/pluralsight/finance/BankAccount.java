package com.pluralsight.finance;

public class BankAccount implements IValuable{
//add needed variables
    private String name;
    private String accountNumber;
    private double balance;

// add constructor

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //add getters

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    //add derived variables


}
