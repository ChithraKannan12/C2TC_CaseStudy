package com.tns.onlineshopping.entities;
import java.util.*;

public class Customer extends User {
    private String address; // [cite: 42]
    private int rewardPoints = 0; // For Eco-Score logic

    public Customer(int userId, String username, String email, String address) {
        super(userId, username, email);
        this.address = address;
    }
    public void addRewardPoints(int pts) { this.rewardPoints += pts; }
    public int getRewardPoints() { return rewardPoints; }
}