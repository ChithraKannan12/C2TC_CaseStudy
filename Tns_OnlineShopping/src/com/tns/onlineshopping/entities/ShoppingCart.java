package com.tns.onlineshopping.entities;
import java.util.*;

public class ShoppingCart {
    private List<ProductQuantityPair> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        items.add(new ProductQuantityPair(product, quantity));
    }

    public List<ProductQuantityPair> getItems() {
        return items;
    }

    public void clearCart() {
        items.clear();
    }
}