package com.tns.onlineshopping.services;
import com.tns.onlineshopping.entities.*;

public class OrderService {
    public void processOrder(Customer customer, Product product, int qty, int groupSize) {
        double price = product.getPrice() * qty;

        // Advanced Feature: Group Discount [10%]
        if (groupSize >= 3) {
            price *= 0.90;
            System.out.println("Group Discount Applied!");
        }

        if (product.getStockQuantity() >= qty) {
            product.setStockQuantity(product.getStockQuantity() - qty); // [cite: 6, 520]
            
            // Advanced Feature: Eco-Rewards
            if (product.getEcoScore() >= 4) {
                customer.addRewardPoints(50);
                System.out.println("Eco-Friendly Reward Added!");
            }
            System.out.println("Order Successful! Total Bill: " + price);
        } else {
            System.out.println("Insufficient stock!"); // [cite: 522]
        }
    }
}