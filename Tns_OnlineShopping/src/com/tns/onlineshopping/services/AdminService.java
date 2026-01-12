package com.tns.onlineshopping.services;
import com.tns.onlineshopping.entities.*;

public class AdminService {
    public void updateOrderStatus(Order order, String status) {
        // As per PDF: Admin can change status to Completed/Delivered/Cancelled
        System.out.println("Order Status updated to: " + status);
    }
}