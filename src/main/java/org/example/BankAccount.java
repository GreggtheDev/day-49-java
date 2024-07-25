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
        // Create two accounts
        BankAccount account1 = new BankAccount("Alice", 5000);
        BankAccount account2 = new BankAccount("Bob", 300);

        // Withdraw $100 from the first account
        account1.withdraw(100);

        // Deposit $100 to the second account
        account2.deposit(100);

        // Print account details
        System.out.println(account1);
        System.out.println(account2);
    }
}
