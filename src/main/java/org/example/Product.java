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
