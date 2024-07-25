package org.example;

public class BankAccount { //class that takes 2 attributes of balance and account holder
    private double balance;
    private String accountHolder;



    public BankAccount( String accountHolder, double balance) { // constructor of BankAccount class, takes attributes as parameters
        this.balance = balance;
        this.accountHolder = accountHolder;

    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: $" + amount + " to " + accountHolder);
        } else {
            System.out.println("Insufficient funds");
        }

    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn " + amount + " from " + accountHolder);
        }else if (amount > balance) {
            System.out.println("Insufficient funds");
        }else {
            System.out.println("Amount should be a number");
        }
    }

    public double printAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $ " + balance);
        return balance;
    }
    //Main method
    public static void main(String[] args) {
    //BankAccount object
        BankAccount account = new BankAccount("Sabah", 500);
     //Deposits $100
     account.deposit(100);

     //calling print fn for account details
        account.printAccountDetails();
    }
}


