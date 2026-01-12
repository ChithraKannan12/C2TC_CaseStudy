package com.tns.onlineshopping.services;
import com.tns.onlineshopping.entities.Product;
import java.util.*;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) { products.add(p); }
    public void removeProduct(int id) { products.removeIf(p -> p.getProductId() == id); }
    public List<Product> getProducts() { return products; }
}