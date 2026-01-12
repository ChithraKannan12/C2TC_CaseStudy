package com.tns.onlineshopping.entities;

public abstract class User {
    private int userId; // [cite: 34]
    private String username; // [cite: 35]
    private String email; // [cite: 36]

    public User(int userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }
    public int getUserId() { return userId; }
    public String getUsername() { return username; }
}