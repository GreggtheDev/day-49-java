package org.example;

public class Product {
    private double cost;
    private int quantity;
    private String productName;

    // Constructor to initialize product name, cost, and quantity
    public Product(String productName, double cost, int quantity) {
        this.productName = productName;
        this.cost = cost;
        this.quantity = quantity;
    }

    // Method to calculate total cost
    public void totalCost() {
        double totalCost = cost * quantity;
        System.out.println("Total cost for " + quantity + " units of " + productName + " is $" + totalCost);
    }
