package com.pluralsight.finance;
//add scanner

public class BankAccount implements IValuable{
//add needed variables
    private String name;
    private int accountNumber;
    private double balance;

// add constructor

    public BankAccount(int accountNumber,String name, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //add getters

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
//add value
    public double getValue() {
        return balance;
    }

    //add derived variables
public void deposit(double amount){
        this.balance += amount;
}

public void withdraw(double amount){
        this.balance -= amount;
}


    //add tostring

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

