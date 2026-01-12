package com.tns.onlineshopping.entities;
import java.util.List;

public class Order {
    private int orderId; // [cite: 52]
    private Customer customer; // [cite: 53]
    private List<ProductQuantityPair> products; // [cite: 54]
    private String status; // [cite: 55]

    public Order(int orderId, Customer customer, List<ProductQuantityPair> products, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
        this.status = status;
    }
    public String getStatus() { return status; }
}