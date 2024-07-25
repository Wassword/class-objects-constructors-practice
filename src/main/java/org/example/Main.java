package org.example;


public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 5000);
        BankAccount account2 = new BankAccount("Jane Doe", 300);

        // withdraw from the first account
        account1.withdraw(100);
        System.out.println(account1.printAccountDetails());

        //Deposit into second account
        account2.deposit(100);
        System.out.println(account2.printAccountDetails());

    }
}
