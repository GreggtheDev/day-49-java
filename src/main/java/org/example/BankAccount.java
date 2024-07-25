package org.example;

public class BankAccount {
    private double balance;
    private String accountHolderName;

    // Constructor to initialize account holder's name and balance
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }