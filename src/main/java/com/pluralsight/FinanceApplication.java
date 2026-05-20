package com.pluralsight;

import com.pluralsight.finance.*;


public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        IValuable account2 = new BankAccount(456, "Gary", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        //account2.deposit(100);
        //account 2 doesn't work because we didn't declare it in the valuable the only rule passed is the need to get value



        //updated to add  bonus
        Portfolio myPortfolio = new Portfolio("My Finances", "Mikayla <3");

        // add accounts
        BankAccount ChaseBankChecking = new BankAccount(98565097, "Danese", 1038.87);
        BankAccount ChaseBankSaving = new BankAccount(12345623, "Mikayla", 876.13);
        CreditCard Discover = new CreditCard("Lola", 8763682, 600 );

        // add valuables
        myPortfolio.add(new Gold("backyard finds", 60000.00, 50));
        myPortfolio.add(new Jewelry("Family Heirlooom necklace", 57376.12, 68 ));
        myPortfolio.add(new House("Swtzerland Getaway", 850000.56, 2015, 20968,3));

        //add print statments



    }
}
