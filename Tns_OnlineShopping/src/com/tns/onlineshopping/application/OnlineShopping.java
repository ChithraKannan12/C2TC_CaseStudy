package com.tns.onlineshopping.application;
import com.tns.onlineshopping.entities.*;
import com.tns.onlineshopping.services.*;
import java.util.Scanner;

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService prodService = new ProductService();
        CustomerService custService = new CustomerService();
        ShoppingCart cart = new ShoppingCart();

        // Initial Data (Admin adds a product)
        prodService.addProduct(new Product(101, "Organic Shirt", 1000.0, 50, 5));
        Customer currentCustomer = new Customer(1, "Chithra", "chithra@mail.com", "Chennai");

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. View Products\n2. Add to Cart\n3. Checkout\n4. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                prodService.getProducts().forEach(p -> 
                    System.out.println(p.getProductId() + ": " + p.getName() + " [Eco-Score: " + p.getEcoScore() + "]"));
            } else if (choice == 2) {
                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Quantity: ");
                int q = sc.nextInt();
                Product p = prodService.getProducts().stream().filter(prod -> prod.getProductId() == id).findFirst().orElse(null);
                if (p != null) cart.addItem(p, q);
            } else if (choice == 3) {
                System.out.print("Enter Group Size for Discount: ");
                int gs = sc.nextInt();
                custService.checkout(currentCustomer, cart, gs);
            } else {
                break;
            }
        }
        sc.close();
    }
}