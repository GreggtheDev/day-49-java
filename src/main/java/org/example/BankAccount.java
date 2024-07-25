package org.example;

public class BankAccount {
    private double balance;
    private String accountHolderName;

    // Constructor to initialize account holder's name and balance
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to print account details
    @Override
    public String toString() {
        return "Account Holder: " + accountHolderName + "\nBalance: $" + balance;
    }

    public static void main(String[] args) {
        // Instantiate a BankAccount object with $500
        BankAccount account = new BankAccount("John Doe", 500);
        // Deposit $100
        account.deposit(100);
        // Print account details
        System.out.println(account);
    }
}