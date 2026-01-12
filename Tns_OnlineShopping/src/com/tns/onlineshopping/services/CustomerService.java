package com.tns.onlineshopping.services;
import com.tns.onlineshopping.entities.*;

public class CustomerService {
    public void checkout(Customer customer, ShoppingCart cart, int groupSize) {
        double total = 0;
        for (ProductQuantityPair pair : cart.getItems()) {
            double itemPrice = pair.getProduct().getPrice() * pair.getQuantity();
            
            // ADVANCED FEATURE 1: Eco-Rewards
            if (pair.getProduct().getEcoScore() >= 4) {
                customer.addRewardPoints(50);
                System.out.println("Eco-Bonus for " + pair.getProduct().getName());
            }
            total += itemPrice;
        }

        // ADVANCED FEATURE 2: Group Discount
        if (groupSize >= 3) {
            total *= 0.90;
            System.out.println(">>> Group Discount Applied (10%)");
        }

        System.out.println("Final Total Amount: " + total);
        System.out.println("Customer Reward Points: " + customer.getRewardPoints());
        cart.clearCart();
    }
}
