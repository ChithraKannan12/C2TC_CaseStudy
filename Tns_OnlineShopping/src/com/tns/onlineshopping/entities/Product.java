package com.tns.onlineshopping.entities;

public class Product {
    private int productId; // [cite: 25]
    private String name; // [cite: 26]
    private double price; // [cite: 27]
    private int stockQuantity; // [cite: 28]
    private int ecoScore; // Added Advanced Feature

    public Product(int productId, String name, double price, int stockQuantity, int ecoScore) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.ecoScore = ecoScore;
    }
    // Getters and Setters [cite: 257]
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int qty) { this.stockQuantity = qty; }
    public int getEcoScore() { return ecoScore; }
}
